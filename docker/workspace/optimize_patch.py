import os
import openai
import json
import re
import time
import sys
import difflib
import tiktoken

openai.api_key = "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"
openai.organization = "org-mSMx268bkMcTa5gXwsDGN8Af"
JAVA_ANALYZER="java_analyzer/target/java-analyzer-1.0-SNAPSHOT-shaded.jar"

class JavaFileParsingError(Exception):
    pass

class D4JEnv:
    def __init__(self, pid, vid):
        self.pid, self.vid = pid, vid
        self.fixed_dir = f"/tmp/{pid}-{vid}f"
        self.buggy_dir = f"/tmp/{pid}-{vid}b"
        self.mod_dir = f"/tmp/{pid}-{vid}m"
        self.output_dir = f"./analyzed_files/{self.pid}-{self.vid}/"

        # if not os.path.exists(f"/tmp/{pid}-{vid}f-reg-test"):
        #     os.system(f"gen_tests.pl -g evosuite -p {pid} -v {vid}f -n 1 -o /tmp/{pid}-{vid}f-reg-test -b 180")
        if not os.path.exists(self.fixed_dir):
            os.system(f"defects4j checkout -p {pid} -v {vid}f -w {self.fixed_dir}")
        if not os.path.exists(self.buggy_dir):
        # os.system(f"rm -rf {self.buggy_dir}")
            os.system(f"defects4j checkout -p {pid} -v {vid}b -w {self.buggy_dir}")
        if not os.path.exists(os.path.join(self.buggy_dir, "dir.src.classes")):
            os.system(f"cd {self.buggy_dir} && defects4j export -p dir.src.classes -o dir.src.classes")
        if not os.path.exists(os.path.join(self.buggy_dir, "dir.src.tests")):
            os.system(f"cd {self.buggy_dir} && defects4j export -p dir.src.tests -o dir.src.tests")
        if not os.path.exists(os.path.join(self.buggy_dir, "dir.bin.classes")):
            os.system(f"cd {self.buggy_dir} && defects4j export -p dir.bin.classes -o dir.bin.classes")
        if not os.path.exists(os.path.join(self.buggy_dir, "tests.trigger")):
            os.system(f"cd {self.buggy_dir} && defects4j export -p tests.trigger -o tests.trigger")
        if not os.path.exists(os.path.join(self.buggy_dir, "cp.compile")):
            os.system(f"cd {self.buggy_dir} && defects4j export -p cp.compile -o cp.compile")
        if not os.path.exists(os.path.join(self.buggy_dir, "failing_tests")):
            os.system(f"cd {self.buggy_dir} && defects4j test")

        # os.system(f"rm -rf {self.mod_dir}")
        # os.system(f"defects4j checkout -p {pid} -v {vid}f -w {self.mod_dir}")

        with open(os.path.join(self.buggy_dir, "dir.src.classes"), 'r') as f:
            self.dir_src_classes = f.read()
        with open(os.path.join(self.buggy_dir, "dir.src.tests"), 'r') as f:
            self.dir_src_tests = f.read()
        with open(os.path.join(self.buggy_dir, "dir.bin.classes"), 'r') as f:
            self.dir_bin_classes = f.read()
        with open(os.path.join(self.buggy_dir, "tests.trigger"), 'r') as f:
            self.tests_trigger = f.read().split('\n')
        with open(os.path.join(self.buggy_dir, "cp.compile"), 'r') as f:
            self.cp_compile = f.read()

        if not os.path.exists(self.output_dir):
            os.mkdir(self.output_dir)
            os.mkdir(os.path.join(self.output_dir, "range"))

        self.new_range_files = set()

        self.files_to_analyze = set()
        patch_path = f"/defects4j/framework/projects/{pid}/patches/{vid}.src.patch"
        with open(patch_path, "r", errors='ignore') as f:
            buggy_file = None
            lines = f.readlines()
            for l in lines:
                if l.startswith("+++"):
                    b = re.match("(\+*\s*)(\S*)", l)
                    if b is None:
                        continue
                    buggy_file = b.group(2).split("b/")[-1]
                    self.files_to_analyze.add(buggy_file)
                    continue

        os.system("rm -rf /tmp/patch.txt")
        for file in self.files_to_analyze:
            os.system(f"cd {self.buggy_dir} && git diff HEAD..HEAD^ -- {file} >> /tmp/patch.txt")
            self.analyze_src_file(file)

    def count_hunk(self):
        hunk_num = 0
        with open(f"/tmp/patch.txt", "r", errors='ignore') as f:
            lines = f.readlines()
            for l in lines:
                m = re.match("^@@ -\d+,\d+ \+(\d+),\d+ @@", l)
                if m:
                    hunk_num += 1
                    continue

        return hunk_num

    def optimize_patch(self, imp_type):
        f = open(f"/tmp/patch.txt", "r", errors='ignore')
        e = open(os.path.join(self.buggy_dir, "failing_tests"), "r", errors='ignore')
        
        dev_patch = f.read()
        e_lines = e.readlines()
        error_msg = ''
        for l in e_lines:
            if 'Native Method' in l:
                break
            error_msg += l

        # pre_patch = self.obtain_origin_src()
        # template = self.obtain_template()
        failing_tests = self.get_failing_tests()
        # guide = "Start by calling the 'get_regression_test' function. Then, if you need to retrieve failing tests of buggy version, call the 'get_failing_test' function."
        # guide = "Start by calling the 'get_failing_test' function. Then, if you need to retrieve regression tests of bug-fixed version, call the 'get_regression_test' function."

        guide = "Provide refactored patch by filling the template. Your patch should be a patch from the pre-patched(buggy) version. Start by calling the 'get_failing_test' function."
        first_prompt_contents = "The failing test(s) of the bug looks like: \n" + "```java\n" + failing_tests + "```\nThe error message looks like: \n```\n" + error_msg + "\n```\n" + "The developer patch looks like: \n" + "```diff\n" + dev_patch + "``` \n" + "\nProvide the summary of the patch contents."
        
        # dev_and_temp = "The developer patch looks like: \n" + "```diff\n" + dev_patch + "``` \n" + "\nThe template of patch looks like: \n" + "```diff\n" + template + "```\n" + guide

        
        prompt = open("prompt.txt", "w")
        prompt.write(first_prompt_contents)
        # prompt.close()

        ex_patch = open(f"./example.txt", "r")
        ex_patch = ex_patch.read()
        be_patch = open(f"./better_example.patch", "r")
        be_patch = be_patch.read()

    
        messages = [
            # {
            #     "role": "system", 
            #     "content": ("You are a refactoring assistant. You will be provided with failing test(s) of the bug, error message of the failing test(s), and the developer patch of the bug. "
            #                 "Your task is providing the summary of the patch contents. "
            #                 "Then, you will be provided with code snippet of the developer-fixed version. Your task is providing refactored code snippet of that part based on the summary of the patch contents and the fixed code snippet. "
            #                 "Finally, you will be provided with whole method of the developer-fixed code snippet. Your task is apply your refactored code snippet to the method. "
            #                 )
            # },
            # {
            #     "role": "user",
            #     "content": ex_patch
            # },
            # {
            #     "role": "assistant",
            #     "content": be_patch
            # },
            {
                "role": "user", 
                "content": first_prompt_contents
            },
        ]
        functions = [
            # {
            #     "name": "get_regression_tests",
            #     "description": "Get the regression test suite of bug-fixed version(version after the developer patch is applied).",
            #     "parameters": {
            #         "type": "object",
            #         "properties": {}
            #     }
            # },
            {
                "name": "get_failing_tests",
                "description": "Get the failing tests of buggy version(version before the developer patch is applied).",
                "parameters": {
                    "type": "object",
                    "properties": {}
                }
            },
        ]
        # print(messages)
        # print(self.num_tokens_from_messages(messages))
        if self.num_tokens_from_messages(messages) > 4097:
            return None, None, None
        
        response = openai.ChatCompletion.create(
            model="gpt-3.5-turbo-0613",
            messages=messages,
            # functions=functions,
            # function_call="auto"
        )

        response_message = response["choices"][0]["message"]
        messages.append(response_message)
        self.line_dict = {}
        fixed_ver_code = self.obtain_fixed_src()
        # print(self.line_dict)

        patch_contents = self.fixed_lines()
        # print(patch_contents)
        fixed_ver_method = self.extract_method_name(patch_contents)
        if self.count_method(patch_contents) > 1:
            return None, None, None
        # print(self.line_dict)
        # fixed_ver_method = self.extract_method(self.buggy_list)

        if imp_type == 'time':
            improve_contents = " to improve time-efficiency"
        elif imp_type == 'memory':
            improve_contents = " to improve memory-efficiency"
        elif imp_type == None:
            improve_contents = ""
        second_prompt_contents = "The code fixed by the previous developer patch is as follows:\n" + "```java\n" + fixed_ver_code + f"```\nRefactor the fixed code based on your summary of the patch contents and fixed code snippet{improve_contents}. Refactored code should be semantically same as fixed code. \n```java\ninsert refactored code here\n```"
        # print(second_prompt_contents)
        messages.append(
            {
                "role": "user",
                "content": second_prompt_contents
            }
        )
        prompt.write("\n" + response_message["content"])
        prompt.write("\n" + second_prompt_contents)

        if self.num_tokens_from_messages(messages) > 4097:
            return None, None, None
        
        response = openai.ChatCompletion.create(
            model="gpt-3.5-turbo-0613",
            messages=messages,
        )
        response_message = response["choices"][0]["message"]
        # print(response_message)
        messages.append(response_message)
        # print(response_message["content"])

        prompt.write("\n" + response_message["content"])

        third_prompt_contents = "This is the whole method of the developer-fixed code snippet:\n" + "```java\n" + fixed_ver_method + "```\nApply your refactored code snippet to the original method. \n```java\ninsert refactored method here\n```"
        messages.append(
            {
                "role": "user",
                "content": third_prompt_contents
            }
        )
        prompt.write("\n" + third_prompt_contents)
        if self.num_tokens_from_messages(messages) > 4097:
            return None, None, None
        
        response = openai.ChatCompletion.create(
            model="gpt-3.5-turbo-0613",
            messages=messages,
        )
        response_message = response["choices"][0]["message"]
        messages.append(response_message)
        prompt.write("\n" + response_message["content"])
        if self.num_tokens_from_messages(messages) > 4097:
            return None, None, None
        
        p = re.compile("```java(.*)```", re.DOTALL)
        refactored_code = p.search(response_message["content"])
        if refactored_code == None:
            return fixed_ver_method, fixed_ver_method, self.line_dict
        refactored_code = refactored_code.group(1).lstrip("\n").rstrip("\n")
        # print(response_message["content"])
        # print(fixed_ver_code.lstrip("\n").rstrip("\n"))
        # print(refactored_code)
        # print(self.line_dict)

        # self.apply_patch(refactored_code)


        # while response_message.get("function_call"):
        #     available_functions = {
        #         "get_regression_tests": self.get_regression_tests,
        #         "get_failing_tests": self.get_failing_tests
        #     }
        #     function_name = response_message["function_call"]["name"]
        #     called_func.append(function_name)
        #     fuction_to_call = available_functions[function_name]
        #     function_response = fuction_to_call()

        #     messages.append(response_message)
        #     messages.append(
        #         {
        #             "role": "function",
        #             "name": function_name,
        #             "content": function_response
        #         }
        #     )

        #     response = openai.ChatCompletion.create(
        #         model="gpt-3.5-turbo-0613",
        #         messages=messages,
        #         functions=functions,
        #         function_call="auto"
        #     )
        #     response_message = response["choices"][0]["message"]

        # print("----------------developer patch----------------")
        # print(dev_patch)
        # print("----------------modified patch----------------")
        # print(response_message["content"])

        # print("----------------called function----------------")
        # print(called_func)
        
        f.close()
        e.close()
        prompt.close()
        # self.apply_patch(response_message["content"])
        # return dev_patch, response_message["content"]
        return fixed_ver_method, refactored_code, self.line_dict

    def num_tokens_from_messages(self, messages, model="gpt-3.5-turbo-0613"):
        try:
            encoding = tiktoken.encoding_for_model(model)
        except KeyError:
            encoding = tiktoken.get_encoding("cl100k_base")
        if model == "gpt-3.5-turbo-0613":  # note: future models may deviate from this
            num_tokens = 0
            for message in messages:
                num_tokens += 4  # every message follows <im_start>{role/name}\n{content}<im_end>\n
                for key, value in message.items():
                    num_tokens += len(encoding.encode(value))
                    if key == "name":  # if there's a name, the role is omitted
                        num_tokens += -1  # role is always required and always 1 token
            num_tokens += 2  # every reply is primed with <im_start>assistant
            return num_tokens
        else:
            raise NotImplementedError(f"""num_tokens_from_messages() is not presently implemented for model {model}.
        See https://github.com/openai/openai-python/blob/main/chatml.md for information on how messages are converted to tokens.""")

    def apply_patch(self, code):
        for src_file, tgt_lines in self.line_dict.items():
            with open(os.path.join(self.fixed_dir, src_file), "r") as f:
                src_lines = f.readlines()
                tgt_lines = sorted(tgt_lines)
                
                start = min(tgt_lines)
                end = max(tgt_lines)
                # print(start, end)
                # print(src_lines[end])
                code = code.split("\n")
                for i in range(len(code)):
                    code[i] = code[i] + "\n"
                print(src_lines[end])
                src_lines = src_lines[:start-1] + code + src_lines[end:]

            with open(os.path.join(self.mod_dir, src_file), "w") as f:
                f.write("".join(src_lines))
        return 

    # def apply_patch(self, patch):
    #     # 1. eliminate '-' lines
    #     # 
    #     # 2. add '+' lines


    #     lines = patch.split("\n")
    #     # print(lines)
    #     buggy_file, start_line = None, None
    #     elim = []
    #     plus = []
    #     for l in lines:
    #         if l.startswith("+++"):
    #             b = re.match("(\+*\s*)(\S*)", l)
    #             if b is None:
    #                 continue
    #             buggy_file = b.group(2).split("b/")[-1]
    #             continue
    #         m = re.match("^@@ -\d+,\d+ \+(\d+),\d+ @@", l)
    #         if m:
    #             start_line = int(m.group(1))
    #             current_line = start_line
    #             continue
    #         if l.startswith("diff"):
    #             buggy_file, start_line = None, None
    #             continue
    #         if buggy_file and start_line:
    #             if l.startswith("+"):
    #                 continue
    #             else:
    #                 if l.startswith("-"):
    #                     elim.append((buggy_file, current_line))
    #                 current_line += 1
    
    #     buggy_file, start_line = None, None
    #     for l in lines:
    #         if l.startswith("+++"):
    #             b = re.match("(\+*\s*)(\S*)", l)
    #             if b is None:
    #                 continue
    #             buggy_file = b.group(2).split("b/")[-1]
    #             continue
    #         m = re.match("^@@ -\d+,\d+ \+(\d+),\d+ @@", l)
    #         if m:
    #             start_line = int(m.group(1))
    #             current_line = start_line
    #             continue
    #         if l.startswith("diff"):
    #             buggy_file, start_line = None, None
    #             continue
    #         if buggy_file and start_line:
    #             if l.startswith("-"):
    #                 continue
    #             else:
    #                 if l.startswith("+"):
    #                     plus.append((buggy_file, current_line, l[1:]))
    #                 current_line += 1

    #     for buggy_file, lnum in elim[::-1]:
    #         with open(os.path.join(self.mod_dir, buggy_file), "r") as f:
    #             src_lines = f.readlines()
    #             # print(src_lines[lnum-1])
    #             src_lines = src_lines[:lnum-1] + src_lines[lnum:]
            
    #         with open(os.path.join(self.mod_dir, buggy_file), "w") as f:
    #             f.write("".join(src_lines))
        
    #     for buggy_file, lnum, pline in plus:
    #         with open(os.path.join(self.mod_dir, buggy_file), "r") as f:
    #             src_lines = f.readlines()
    #             # print(src_lines[lnum-1])
    #             src_lines = src_lines[:lnum-1] + [pline + '\n'] + src_lines[lnum-1:]
            
    #         with open(os.path.join(self.mod_dir, buggy_file), "w") as f:
    #             f.write("".join(src_lines))
        

    #     # print("----------------failing test----------------")
    #     # os.system(f"cd {self.mod_dir} && defects4j test")
    #     return
    
    def run_reg_test(self):
        print("----------------run regression test----------------")
        dev_start = time.time()
        os.system(f"cd {self.fixed_dir} && defects4j test -s /root/workspace/reg_tests/{self.pid}-{self.vid}f-reg-test/{self.pid}/evosuite/1/{self.pid}-{self.vid}f-evosuite.1.tar.bz2")
        dev_end = time.time()
        
        llm_start = time.time()
        os.system(f"cd {self.mod_dir} && defects4j test -s /root/workspace/reg_tests/{self.pid}-{self.vid}f-reg-test/{self.pid}/evosuite/1/{self.pid}-{self.vid}f-evosuite.1.tar.bz2")
        llm_end = time.time()
        print(f"developer patch: {dev_end - dev_start:.5f} sec")
        print(f"llm patch: {llm_end - llm_start:.5f} sec")
        return

    def run_test_suite(self):
        print("----------------run test suite----------------")
        os.system(f"cd {self.mod_dir} && defects4j test")
        return
    
    def obtain_origin_src(self):
        # method 전체를 가져와서 해봐야 할듯.
        src_dict = {}
        with open(f"/tmp/patch.txt", "r") as f:
            buggy_file, start_line = None, None
            lines = f.readlines()
            for l in lines:
                if l.startswith("+++"):
                    b = re.match("(\+*\s*)(\S*)", l)
                    if b is None:
                        continue
                    buggy_file = b.group(2).split("b/")[-1]
                    src_dict.update({buggy_file: set()})
                    continue
                m = re.match("^@@ -\d+,\d+ \+(\d+),\d+ @@", l)
                if m:
                    start_line = int(m.group(1))
                    current_line = start_line
                    continue
                if l.startswith("diff"):
                    buggy_file, start_line = None, None
                    continue

                if buggy_file and start_line:
                    if l.startswith("+"):
                        continue

                    else:
                        src_dict[buggy_file].add(current_line)
                        current_line += 1
        
        origin_src = ''
        for src_file, tgt_lines in src_dict.items():
            with open(os.path.join(self.buggy_dir, src_file), "r") as f:
                src_lines = f.readlines()
                tgt_lines = sorted(tgt_lines)
                for i, l in enumerate(tgt_lines):
                    if tgt_lines[i-1] + 1 != tgt_lines[i]:
                        origin_src = origin_src + '\n'
                    origin_src = origin_src + str(l) + src_lines[l-1]
        return origin_src
    
    def obtain_fixed_src(self):
        src_dict = {}
        with open(f"/defects4j/framework/projects/{self.pid}/patches/{self.vid}.src.patch", "r", errors='ignore') as f:
            buggy_file, start_line = None, None
            lines = f.readlines()
            for l in lines:
                if l.startswith("+++"):
                    b = re.match("(\+*\s*)(\S*)", l)
                    if b is None:
                        continue
                    buggy_file = b.group(2).split("b/")[-1]
                    src_dict.update({buggy_file: set()})
                    continue
                m = re.match("^@@ -\d+,\d+ \+(\d+),\d+ @@", l)
                if m:
                    start_line = int(m.group(1))
                    current_line = start_line
                    continue
                if l.startswith("diff"):
                    buggy_file, start_line = None, None
                    continue

                if buggy_file and start_line:
                    if l.startswith("+"):
                        continue

                    else:
                        src_dict[buggy_file].add(current_line)
                        current_line += 1
        
        fixed_src = ''
        for src_file, tgt_lines in src_dict.items():
            with open(os.path.join(self.fixed_dir, src_file), "r", errors='ignore') as f:
                src_lines = f.readlines()
                tgt_lines = sorted(tgt_lines)
                count = 0
                
                start = min(tgt_lines)
                end = max(tgt_lines)
                # print(start, end)
                self.line_dict.update({src_file: set([start, end])})
                for i in range(start, end + 1):
                    # if tgt_lines[i-1] + 1 != tgt_lines[i]:
                    #     fixed_src = fixed_src + '\n'
                    # fixed_src = fixed_src + str(l) + src_lines[l-1]
                    fixed_src = fixed_src + src_lines[i-1]
                #     count += src_lines[i-1].count("{")
                #     count -= src_lines[i-1].count("}")

                # if count > 0:
                #     while count != 0:
                #         end += 1
                #         fixed_src = fixed_src + src_lines[end - 1]
                #         self.line_dict[src_file].add(end)
                #         count += src_lines[end-1].count("{")
                #         count -= src_lines[end-1].count("}")
                # if count < 0:
                #     while count != 0:
                #         start -= 1
                #         fixed_src = src_lines[start - 1] + fixed_src
                #         self.line_dict[src_file].add(start)
                #         count += src_lines[start-1].count("{")
                #         count -= src_lines[start-1].count("}")
        return fixed_src

    def obtain_template(self):
        template = []
        with open(f"/tmp/patch.txt", "r") as f:
            # buggy_file, start_line = None, None
            lines = f.readlines()
            for l in lines:
                if l.startswith("+++"):
                    b = re.match("(\+*\s*)(\S*)", l)
                    if b is None:
                        template.append(l)
                        continue
                    buggy_file = b.group(2).split("b/")[-1]
                    template.append(l)
                    continue
                m = re.match("^@@ -\d+,\d+ \+(\d+),\d+ @@", l)
                if m:
                    start_line = int(m.group(1))
                    current_line = start_line
                    template.append(l)
                    template.append("<INFILL>\n")
                    continue
                if l.startswith("diff"):
                    buggy_file, start_line = None, None
                    template.append(l)
                    continue
                if buggy_file and start_line:
                    continue
        template = "".join(template)
        # print(template)
        return template

    def get_range_path(self, src_path):
        return os.path.join(os.path.join(self.output_dir, "range"), src_path.replace("/", "+"))

    def analyze_src_file(self, src_path, overwrite=True, verbose=True):
        if not os.path.exists(os.path.join(self.buggy_dir, src_path)):
            return None
        # src_path = r"{}".format(src_path).replace(r'$', r'\$')\
        src_path = src_path.replace('$', '\$')
        output_path = self.get_range_path(src_path)
        
        
        if not os.path.exists(output_path.replace('\$', '$')) or (overwrite and output_path not in self.new_range_files):
            command = f'java -jar {JAVA_ANALYZER} {os.path.join(self.fixed_dir, src_path)} {output_path} {os.path.join(self.fixed_dir, self.dir_src_classes)} {self.cp_compile.replace(":", " ")}'
            if self.pid == "Mockito":
                command += " /defects4j/framework/projects/lib/junit-4.11.jar"
            if verbose:
                print(command)
            os.system(command)
        
        # output_path = r"{}".format(output_path).replace(r'\$', r'$')
        output_path = output_path.replace('\$', '$')
        if os.path.exists(output_path):
            self.new_range_files.add(output_path)
            return output_path
        else:
            raise JavaFileParsingError(f"Error while parsing java file: {src_path}")

    def is_added_hunk(self, lines, i):
        for line in lines[i:]:
            if line.startswith("-"):
                continue
            # startswith + or any other letter
            else:
                # consecutive - and +
                if line.startswith("+"):
                    return False
                # only -
                else:
                    return True
        # only -
        return True


    def fixed_lines(self):
        b_lines = set()
        with open(f"/tmp/patch.txt", "r", errors='ignore') as f:
            buggy_file, start_line = None, None
            lines = f.readlines()
            for i, l in enumerate(lines):
                if l.startswith("+++"):
                    b = re.match("(\+*\s*)(\S*)", l)
                    if b is None:
                        continue
                    buggy_file = b.group(2).split("b/")[-1]
                    continue
                m = re.match("^@@ -\d+,\d+ \+(\d+),\d+ @@", l)
                if m:
                    start_line = int(m.group(1))
                    current_line = start_line
                    continue
                if l.startswith("diff"):
                    buggy_file, start_line = None, None
                    continue
                if buggy_file and start_line:
                    if l.startswith("-"):
                        # surrounding lines
                        if self.is_added_hunk(lines, i):
                            b_lines.add((buggy_file, current_line - 1, True))
                            b_lines.add((buggy_file, current_line, True))
                    else:
                        if l.startswith("+"):
                            b_lines.add((buggy_file, current_line, False))
                        current_line += 1
            
        return b_lines
    
    def count_method(self, patch_contents):
        buggy_methods = set()
        for range_file_path in self.new_range_files:
            with open (range_file_path, "r") as f:
                file_range = json.load(f)
                filepath = file_range['filepath'].split('/')[3:]
                filepath = '/'.join(filepath)
                nodes = file_range['nodes']
                fixed_lines = set()

                for content in patch_contents:
                    if content[0] == filepath:
                        fixed_lines.add(content)

                for node in nodes:
                    for fixed_line in fixed_lines:
                        source, lineno, omission_flag = fixed_line
                        if node['begin_line'] <= lineno and node['end_line'] >= lineno:
                            if node['type'] == "method" or node['type'] == "constructor":
                                # print(node)
                                # self.line_dict[source].add(node['begin_line'])
                                # self.line_dict[source].add(node['end_line'])
                                # self.line_dict[source] = set([node['begin_line'], node['end_line']])
                                buggy_methods.add(node["signature"])
        return len(buggy_methods)

    def extract_method_name(self, patch_contents):
        buggy_methods = set()
        result = set()
        keys = ("class_file", "method_name", "arg_types")

        for range_file_path in self.new_range_files:
            with open (range_file_path, "r") as f:
                file_range = json.load(f)
                filepath = file_range['filepath'].split('/')[3:]
                filepath = '/'.join(filepath)
                nodes = file_range['nodes']
                fixed_lines = set()

                for content in patch_contents:
                    if content[0] == filepath:
                        fixed_lines.add(content)

                for node in nodes:
                    for fixed_line in fixed_lines:
                        source, lineno, omission_flag = fixed_line
                        if node['begin_line'] <= lineno and node['end_line'] >= lineno:
                            if node['type'] == "method" or node['type'] == "constructor":
                                # print(node)
                                self.line_dict[source].add(node['begin_line'])
                                self.line_dict[source].add(node['end_line'])
                                self.line_dict[source] = set([node['begin_line'], node['end_line']])
        #                         signature = node['signature']
        #                         class_file = filepath.replace(self.dir_src_classes + '/', '')
        #                         class_name = filepath.split('/')[-1].split('.')[0]

        #                         class_path = class_file.split('.')[0]
        #                         class_path = class_path.replace('$', '\$')
        #                         class_path = [self.buggy_dir, self.dir_bin_classes, class_path]
        #                         class_path = os.path.join(*class_path) 


        #                         method_name = signature.split('(')[0].split('.')[-1]
        #                         if node['type'] == "constructor":
        #                             method_name = '<init>'

        #                         arg_types = self.extract_arg_type(signature, class_path, class_name)

        #                         buggy_methods.add((
        #                             keys + tuple(node.keys()), 
        #                             (class_file, method_name, arg_types) + tuple(node.values())
        #                         ))
        #                         # print(buggy_methods)
                            
        #                     if node['type'] == "field" and (not omission_flag or node["begin_line"] < lineno < node["end_line"]):
        #                         class_file = filepath.replace(self.dir_src_classes + '/', '')
        #                         method_name = '<clinit>'
        #                         arg_types = ''

        #                         node['varNames'] = tuple(node['varNames'])
        #                         buggy_methods.add((
        #                             keys + tuple(node.keys()), 
        #                             (class_file, method_name, arg_types) + tuple(node.values())
        #                         ))
        #                         # print(buggy_methods)

        # for keys, values in buggy_methods:
        #     buggy_element = dict(zip(keys, values))
        #     if 'varNames' in buggy_element:
        #         buggy_element['varNames'] = list(buggy_element['varNames'])
        #     result.append(buggy_element)
        # # return {f"{pid}-{vid}b": result}

        method = ''
        for src_file, tgt_lines in self.line_dict.items():
            with open(os.path.join(self.fixed_dir, src_file), "r", errors='ignore') as f:
                src_lines = f.readlines()
                count = 0
                
                start = min(tgt_lines)
                end = max(tgt_lines)
                self.line_dict.update({src_file: set([start, end])})
                for i in range(start, end + 1):
                    method = method + src_lines[i-1]
        return method
    

    def extract_method(self, buggy_list):
        for method_info in buggy_list:
            signature = method_info["signature"]
            arg_types = signature.split('(')[1].rstrip(')').split(', ')
            arg_mask = [ a_t.split('.')[-1] for a_t in arg_types ]

            with open(os.path.join(*[self.fixed_dir, self.dir_src_classes, method_info["class_file"]]), "r") as f:
                src_lines = f.readlines()
                tgt_method_line = 0
                line_diff = len(src_lines)
                tgt_lines = self.line_dict[os.path.join(self.dir_src_classes, method_info["class_file"])]
                start = min(tgt_lines)
                end = max(tgt_lines)

                print(method_info["method_name"], arg_mask, signature)
                for i, l in enumerate(src_lines):
                    if method_info["method_name"] in l and all(arg in l for arg in arg_mask):
                        print(l)
                        print(i + 1)
                        if start - (i + 1) < line_diff and start - (i + 1) >= 0:
                            line_diff = start - (i + 1)
                            tgt_method_line = i + 1
                
                print(tgt_method_line)
                count = 0
                fixed_method = ''
                for i in range(tgt_method_line, len(src_lines)):
                    count += src_lines[i-1].count("{")
                    count -= src_lines[i-1].count("}")
                    fixed_method = fixed_method + src_lines[i-1]
                    if count == 0:
                        self.line_dict[os.path.join(self.dir_src_classes, method_info["class_file"])] = set([tgt_method_line, i])
                        break
                print(fixed_method)
        return fixed_method


    def extract_arg_type(self, signature, class_path, class_name):
        for cname in os.listdir(os.path.dirname(class_path)):           
            if cname.startswith(os.path.basename(class_path)):
                cname = cname.replace('$', '\$')
                os.system(f"javap -p -s {os.path.join(os.path.dirname(class_path), cname)} >> /tmp/test.txt")
                found, arg_type = self.method_matching(signature, class_name)
                if found:
                    return arg_type

    def method_matching(self, signature, class_name):
        method_name = signature.split('(')[0].split('.')[-1]
        arg_types = signature.split('(')[1].rstrip(')').split(', ')
        arg_mask = [ a_t.split('.')[-1] for a_t in arg_types ]
        # arg_mask = method_name + '(' + ','.join(arg_mask) + ')'
        #print(arg_mask)
        arg_type = ''
        found = False
        with open(f"/tmp/test.txt", "r") as f:
            for line in f.readlines():
                m = re.match("(.*)\((.*)\)", line)
                if m is None:
                    continue
                # method name is connected with '.' or '$'
                this_method_name = m.group(1).split()[-1].split(".")[-1].split("$")[-1]
                if this_method_name == method_name: #FIXME
                    # print(line)
                    line_arg = line.split('(')[1]
                    line_arg = line_arg.split(')')[0].split(', ')
                    line_arg_mask = [ a_t.split('.')[-1].split('$')[-1] for a_t in line_arg ]
                    # print(line_arg_mask)
                    if line_arg_mask == arg_mask:
                        found = True
                        print(line)
                        continue

                    tmp_mask = [class_name] + arg_mask
                    if line_arg_mask == tmp_mask:
                        found = True
                        print(line)
                        continue
                if found == True:
                    arg_type = line.split('(')[1].split(')')[0]
                    # print(line.split('(')[1].split(')'))
                    break
        # os.system(f"rm /tmp/test.txt")
        return found, arg_type

    
    def get_regression_tests(self):
        os.system(f"tar -jxvf /tmp/{self.pid}-{self.vid}f-reg-test/{self.pid}/evosuite/1/{self.pid}-{self.vid}f-evosuite.1.tar.bz2 -C /tmp/{self.pid}-{self.vid}f-reg-test/{self.pid}/evosuite/1/")
        for file in self.files_to_analyze:
            path_to_test = file.replace(self.dir_src_classes, "")
            path_to_test = path_to_test.replace(".java", "_ESTest.java")
            f = open(f"/tmp/{self.pid}-{self.vid}f-reg-test/{self.pid}/evosuite/1{path_to_test}")
            reg_tests = f.read()
            f.close()
        return reg_tests
    
    def get_failing_tests(self):
        failing_tests = ''
        for test in self.tests_trigger:
            path_to_test, test_name = test.split("::")[0], test.split("::")[1]
            path_to_test = os.path.join(self.dir_src_tests, path_to_test.replace('.', '/') + ".java")
            # print(os.path.join(self.buggy_dir, path_to_test))
            
            with open(os.path.join(self.buggy_dir, path_to_test), "r", errors='ignore') as f:
                lines = f.readlines()
                start_flag = 0
                for l in lines:
                    if test_name + '()' in l:
                        start_flag += 1
                        failing_tests = failing_tests + l
                        continue

                    if start_flag == 0:
                        continue
                    
                    if '{' in l:
                        start_flag += 1
                    if '}' in l:
                        start_flag -= 1
                    failing_tests = failing_tests + l
        return failing_tests

    # def is_fixed_hunk(self, lines, i):
    #     for line in lines[i:]:
    #         if line.startswith("-"):
    #             continue
    #         # startswith + or any other letter
    #         else:
    #             # consecutive - and +
    #             if line.startswith("+"):
    #                 return True
    #             # only -
    #             else:
    #                 return False
    #     # only -
    #     return False

    # def extract_dev_patch(self, path_to_patch):
    #     dev_patch = []
    #     with open(path_to_patch, "r", errors='ignore') as f:
    #         start_line = None
    #         elim_lines = []
    #         added_lines = []
    #         lines = f.readlines()
    #         for i, l in enumerate(lines):
    #             m = re.match("^@@ -\d+,\d+ \+(\d+),\d+ @@", l)
    #             if m:
    #                 start_line = int(m.group(1))
    #                 current_line = start_line
    #                 dev_patch.append(l)
    #                 continue
    #             if l.startswith("diff"):
    #                 start_line = None
    #                 dev_patch.append(l)
    #                 continue
    #             if start_line:
    #                 if l.startswith("-"):
    #                     if self.is_fixed_hunk(lines, i):
    #                         elim_lines.append(i)
    #                     l = "+" + l[1:]

    #                 else:
    #                     if l.startswith("+"):
    #                         if len(elim_lines) > 0:
    #                             added_lines.append(i)
    #                         l = "-" + l[1:]
    #                     else:
    #                         if len(elim_lines) > 0:
    #                             dev_patch = dev_patch[:elim_lines[0]] + [dev_patch[i] for i in added_lines] + [dev_patch[i] for i in elim_lines]
    #                             elim_lines = []
    #                             added_lines = []
    #                     current_line += 1

    #             dev_patch.append(l)
    #     return "".join(dev_patch)





if __name__ == "__main__":
    mode = sys.argv[1]

    if mode == "test":
        pid, vid = "Jsoup", "47"
        env = D4JEnv(pid, vid)
        dev_fixed_code, llm_refactored_code, method_line = env.optimize_patch(None)
        # env.run_reg_test()
        # env.run_test_suite()

        if not os.path.exists(f"./data/{pid}-{vid}b"):
            os.system(f"mkdir -p ./data/{pid}-{vid}b")
        with open(f"./data/{pid}-{vid}b/dev_fixed_code.txt", "w") as f:
            f.write(dev_fixed_code)
        with open(f"./data/{pid}-{vid}b/llm_refactored_code.txt", "w") as f:
            f.write(llm_refactored_code)
        with open(f"./data/{pid}-{vid}b/method_line.txt", "w") as f:
            for src_file, tgt_lines in method_line.items():
                f.write(str(min(tgt_lines)) + '\n')
                f.write(str(max(tgt_lines)))

    if mode == "exec":
        os.system("defects4j pids > /tmp/pids")

        p = open("/tmp/pids", "r")
        for pid in p:
            pid = pid.replace('\n', '')
            if pid != "Chart":
                continue
            os.system(f"defects4j bids -p {pid} > /tmp/vids")
            result = {}
            v = open("/tmp/vids", "r")
            for vid in v.readlines():
                vid = vid.replace('\n', '')
                
                bug_name = f"{pid}-{vid}b"

                vid = vid.replace('\n', '')
                sample_cnt = 0
                # if vid == '5':
                #     continue
                if not os.path.exists(f"./data/{pid}-{vid}b"):
                    env = D4JEnv(pid, vid)
                    if env.count_hunk() == 1:
                        
                        # dev_fixed_code, llm_refactored_code, method_line = env.optimize_patch()
                        # if dev_fixed_code == None:
                        #     continue

                        # os.system(f"mkdir -p ./data/{pid}-{vid}b")
                        # with open(f"./data/{pid}-{vid}b/dev_fixed_code.txt", "w") as f:
                        #     f.write(dev_fixed_code)
                        # with open(f"./data/{pid}-{vid}b/llm_refactored_code_1.txt", "w") as f:
                        #     f.write(llm_refactored_code)
                        # with open(f"./data/{pid}-{vid}b/method_line.txt", "w") as f:
                        #     for src_file, tgt_lines in method_line.items():
                        #         f.write(str(min(tgt_lines)) + '\n')
                        #         f.write(str(max(tgt_lines)))

                        # for i in range(sample_cnt - 1):
                        while sample_cnt < 5:
                            if not os.path.exists(f"./data/{pid}-{vid}b/llm_refactored_code_{sample_cnt+1}.txt"):
                                dev_fixed_code, llm_refactored_code, method_line = env.optimize_patch(None)
                                if dev_fixed_code == None:
                                    if os.path.exists(f"./data/{pid}-{vid}b"):
                                        os.system(f"rm -rf ./data/{pid}-{vid}b")
                                    break

                                if dev_fixed_code == 0:
                                    if os.path.exists(f"./data/{pid}-{vid}b"):
                                        os.system(f"rm -rf ./data/{pid}-{vid}b")
                                    break


                                if not os.path.exists(f"./data/{pid}-{vid}b"):
                                    os.system(f"mkdir -p ./data/{pid}-{vid}b")
                                with open(f"./data/{pid}-{vid}b/dev_fixed_code.txt", "w") as f:
                                    f.write(dev_fixed_code)
                                with open(f"./data/{pid}-{vid}b/llm_refactored_code_{sample_cnt+1}.txt", "w") as f:
                                    f.write(llm_refactored_code)
                                with open(f"./data/{pid}-{vid}b/method_line.txt", "w") as f:
                                    for src_file, tgt_lines in method_line.items():
                                        f.write(str(min(tgt_lines)) + '\n')
                                        f.write(str(max(tgt_lines)))
                            sample_cnt += 1

    if mode == "improve":
        imp_type = sys.argv[2] # imp_type can be time or memory

        for dname in sorted(os.listdir("./data")):
            try:
                pid, vid = dname.split("-")
                vid = vid[:-1]
            except:
                continue

            bug_name = f"{pid}-{vid}b"
            sample_cnt = 0
            # print(pid == 'Chart', vid == '1')
            # if pid != 'Chart' and pid != '1':
            #     continue
            env = D4JEnv(pid, vid)
            while sample_cnt < 5:
                if not os.path.exists(f"./data/{pid}-{vid}b/llm_improved_{imp_type}_{sample_cnt+1}.txt"):
                    
                    dev_fixed_code, llm_refactored_code, method_line = env.optimize_patch(imp_type)
                    if dev_fixed_code == None:
                        # if os.path.exists(f"./data/{pid}-{vid}b"):
                        #     os.system(f"rm -rf ./data/{pid}-{vid}b")
                        # break
                        continue

                    if dev_fixed_code == 0:
                        # if os.path.exists(f"./data/{pid}-{vid}b"):
                        #     os.system(f"rm -rf ./data/{pid}-{vid}b")
                        # break
                        continue

                    with open(f"./data/{pid}-{vid}b/llm_improved_{imp_type}_{sample_cnt+1}.txt", "w") as f:
                        f.write(llm_refactored_code)

                sample_cnt += 1