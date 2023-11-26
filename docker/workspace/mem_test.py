import os
import time
import re
import csv
import json
import sys

JAVA_ANALYZER="java_analyzer/target/java-analyzer-1.0-SNAPSHOT-shaded.jar"

def extract_method_name(pid, vid, start, end):
    files_to_analyze = set()
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
                files_to_analyze.add(buggy_file)
                continue
    for file in files_to_analyze:
        with open(os.path.join(os.path.join(f"./analyzed_files/{pid}-{vid}/", "range"), file.replace("/", "+")), "r") as f:
            file_range = json.load(f)
            filepath = file_range['filepath'].split('/')[3:]
            filepath = '/'.join(filepath)
            nodes = file_range['nodes']

            for node in nodes:
                if node['begin_line'] <= start and node['end_line'] >= end:
                    if node['type'] == "method" or node['type'] == "constructor":
                        signature = node['signature']
                        method_name = signature.split('(')[0].split('.')[-1]

    return method_name

def apply_patch(pid, vid, start, end, sid, mode):
    code = ""

    if mode == 'normal':
        with open(f"./data/{pid}-{vid}b/llm_refactored_code_{sid}.txt", "r", errors='ignore') as f:
            code = f.read()

    if mode == 'time':
        with open(f"./data/{pid}-{vid}b/llm_improved_time_{sid}.txt", "r", errors='ignore') as f:
            code = f.read()

    if mode == 'mem':
        with open(f"./data/{pid}-{vid}b/llm_improved_memory_{sid}.txt", "r", errors='ignore') as f:
            code = f.read()

    with open(f"/defects4j/framework/projects/{pid}/patches/{vid}.src.patch", "r", errors='ignore') as f:
        src_file, start_line = None, None
        lines = f.readlines()
        for l in lines:
            if l.startswith("+++"):
                b = re.match("(\+*\s*)(\S*)", l)
                if b is None:
                    continue
                src_file = b.group(2).split("b/")[-1]
    
    with open(os.path.join(f"/tmp/{pid}-{vid}f", src_file), "r", errors="ignore") as f:
        src_lines = f.readlines()
        code = code.split("\n")
        for i in range(len(code)):
            code[i] = code[i] + "\n"
        # print(src_lines[end])
        src_lines = src_lines[:start-1] + code + src_lines[end:]

    with open(os.path.join(f"/tmp/{pid}-{vid}m", src_file), "w", errors='ignore') as f:
        f.write("".join(src_lines))
    return

def measure_mem(pid, vid, sid, mode, iter_num, dev_test, reg_test, method_name):
    fixed_dir = f"/tmp/{pid}-{vid}f"
    mod_dir = f"/tmp/{pid}-{vid}m"
    
    fixed_dev_mem = 0
    fixed_dev_list = []
    llm_dev_mem = 0
    llm_dev_list = []
    fixed_reg_mem = 0
    fixed_reg_list = []
    llm_reg_mem = 0
    llm_reg_list = []

    if dev_test == 1:
        for i in range(iter_num):
            if os.path.exists(f'''{fixed_dir}/fixed_dev.recording.jfr'''):
                os.system(f"rm -rf {fixed_dir}/fixed_dev.recording.jfr")
            if os.path.exists(f'''{mod_dir}/llm_dev_{mode}_{sid}.recording.jfr'''):
                os.system(f"rm -rf {mod_dir}/llm_dev_{mode}_{sid}.recording.jfr")

            os.system(f"cd {fixed_dir} && defects4j compile")
            os.system(f"cd {mod_dir} && defects4j compile")

            # generate jrf file
            os.system(f'''cd {fixed_dir} && JAVA_TOOL_OPTIONS="-Dfile.encoding=UTF8 -XX:+UnlockCommercialFeatures -XX:+FlightRecorder -XX:StartFlightRecording=dumponexit=true,settings=profile,filename=fixed_dev.recording.jfr" defects4j test''')
            os.system(f'''cd {mod_dir} && JAVA_TOOL_OPTIONS="-Dfile.encoding=UTF8 -XX:+UnlockCommercialFeatures -XX:+FlightRecorder -XX:StartFlightRecording=dumponexit=true,settings=profile,filename=llm_dev_{mode}_{sid}.recording.jfr" defects4j test''')

            # if not os.path.exists(f'''./data/{pid}-{vid}b/mem_profile/fixed_dev.recording.jfr'''):
            #     os.system(f'''cp {fixed_dir}/fixed_dev.recording.jfr ./data/{pid}-{vid}b/mem_profile/fixed_dev.recording.jfr''')
            # if not os.path.exists(f'''./data/{pid}-{vid}b/mem_profile/llm_dev_{mode}_{sid}.recording.jfr'''):
            #     os.system(f'''cp {mod_dir}/llm_dev_{mode}_{sid}.recording.jfr ./data/{pid}-{vid}b/mem_profile/llm_dev_{mode}_{sid}.recording.jfr''')

            os.system(f'''cd {fixed_dir} && jfr print --json --stack-depth 64 --events jdk.ObjectAllocationInNewTLAB fixed_dev.recording.jfr > /tmp/fixed_dev_mem.json''')
            os.system(f'''cd {mod_dir} && jfr print --json --stack-depth 64 --events jdk.ObjectAllocationInNewTLAB llm_dev_{mode}_{sid}.recording.jfr > /tmp/llm_dev_mem.json''')

            with open('/tmp/fixed_dev_mem.json', 'r') as f:
                fixed_dev = json.load(f)
            with open('/tmp/llm_dev_mem.json', 'r') as f:
                llm_dev = json.load(f)

            for event in fixed_dev['recording']['events']:
                if event['values']['stackTrace'] == None:
                    continue
                for frame in event['values']['stackTrace']['frames']:
                    if frame['method']['name'] == method_name:
                        fixed_dev_mem += event['values']['allocationSize']
                        break
                
            for event in llm_dev['recording']['events']:
                if event['values']['stackTrace'] == None:
                    continue
                for frame in event['values']['stackTrace']['frames']:
                    if frame['method']['name'] == method_name:
                        llm_dev_mem += event['values']['allocationSize']
                        break
                
            fixed_dev_list.append(fixed_dev_mem)
            llm_dev_list.append(llm_dev_mem)
            fixed_dev_mem = 0
            llm_dev_mem = 0

    if reg_test == 1:
        for i in range(iter_num):
            if os.path.exists(f'''{fixed_dir}/fixed_reg.recording.jfr'''):
                os.system(f"rm -rf {fixed_dir}/fixed_reg.recording.jfr")
            if os.path.exists(f'''{mod_dir}/llm_reg_{mode}_{sid}.recording.jfr'''):
                os.system(f"rm -rf {mod_dir}/llm_reg_{mode}_{sid}.recording.jfr")

            # generate jrf file
            os.system(f'''cd {fixed_dir} && JAVA_TOOL_OPTIONS="-Dfile.encoding=UTF8 -XX:+UnlockCommercialFeatures -XX:+FlightRecorder -XX:StartFlightRecording=dumponexit=true,settings=profile,filename=fixed_reg.recording.jfr" defects4j test -s /root/workspace/reg_tests/{pid}-{vid}f-reg-test/{pid}/evosuite/1/{pid}-{vid}f-evosuite.1.tar.bz2''')
            os.system(f'''cd {mod_dir} && JAVA_TOOL_OPTIONS="-Dfile.encoding=UTF8 -XX:+UnlockCommercialFeatures -XX:+FlightRecorder -XX:StartFlightRecording=dumponexit=true,settings=profile,filename=llm_reg_{mode}_{sid}.recording.jfr" defects4j test -s /root/workspace/reg_tests/{pid}-{vid}f-reg-test/{pid}/evosuite/1/{pid}-{vid}f-evosuite.1.tar.bz2''')
            
            # if not os.path.exists(f'''./data/{pid}-{vid}b/mem_profile/fixed_reg.recording.jfr'''):
            #     os.system(f'''cp {fixed_dir}/fixed_reg.recording.jfr ./data/{pid}-{vid}b/mem_profile/fixed_reg.recording.jfr''')
            # if not os.path.exists(f'''./data/{pid}-{vid}b/mem_profile/llm_reg_{mode}_{sid}.recording.jfr'''):
            #     os.system(f'''cp {mod_dir}/llm_reg_{mode}_{sid}.recording.jfr ./data/{pid}-{vid}b/mem_profile/llm_reg_{mode}_{sid}.recording.jfr''')

            os.system(f'''cd {fixed_dir} && jfr print --json --stack-depth 64 --events jdk.ObjectAllocationInNewTLAB fixed_reg.recording.jfr > /tmp/fixed_reg_mem.json''')
            os.system(f'''cd {mod_dir} && jfr print --json --stack-depth 64 --events jdk.ObjectAllocationInNewTLAB llm_reg_{mode}_{sid}.recording.jfr > /tmp/llm_reg_mem.json''')

            with open('/tmp/fixed_reg_mem.json', 'r') as f:
                fixed_reg = json.load(f)
            with open('/tmp/llm_reg_mem.json', 'r') as f:
                llm_reg = json.load(f)

            for event in fixed_reg['recording']['events']:
                if event['values']['stackTrace'] == None:
                    continue
                for frame in event['values']['stackTrace']['frames']:
                    if frame['method']['name'] == method_name:
                        fixed_reg_mem += event['values']['allocationSize']
                        break
            for event in llm_reg['recording']['events']:
                if event['values']['stackTrace'] == None:
                    continue
                for frame in event['values']['stackTrace']['frames']:
                    if frame['method']['name'] == method_name:
                        llm_reg_mem += event['values']['allocationSize']
                        break

            fixed_reg_list.append(fixed_reg_mem)
            llm_reg_list.append(llm_reg_mem)
            fixed_reg_mem = 0
            llm_reg_mem = 0

    print(fixed_dev_list)
    print(llm_dev_list)
    print(fixed_reg_list)
    print(llm_reg_list)
    # mean_fdm = fixed_dev_mem / iter_num
    # mean_ldm = llm_dev_mem / iter_num
    mean_fdm = sum(fixed_dev_list) / iter_num
    mean_ldm = sum(llm_dev_list) / iter_num
    mean_frm = sum(fixed_reg_list) / iter_num
    mean_lrm = sum(llm_reg_list) / iter_num

    return mean_fdm, mean_ldm, mean_frm, mean_lrm

if __name__ == "__main__":
    pid, vid, sid, mode, compile, dev_test, reg_test = 'Compress', '19', '5', 'normal', '1', '1', '1'
    mod_dir = f"/tmp/{pid}-{vid}m"
    fixed_dir = f"/tmp/{pid}-{vid}f"

    iter_num = 5
    mean_fdm = 0
    mean_ldm = 0
    mean_frm = 0
    mean_lrm = 0

    # if not os.path.exists(fixed_dir):
    os.system(f"rm -rf {fixed_dir}")
    os.system(f"defects4j checkout -p {pid} -v {vid}f -w {fixed_dir}")
    # if not os.path.exists(mod_dir):
    os.system(f"rm -rf {mod_dir}")
    os.system(f"defects4j checkout -p {pid} -v {vid}f -w {mod_dir}")

    with open(f"./data/{pid}-{vid}b/method_line.txt", "r", errors='ignore') as m:
        method_lines = m.readlines()
        start = int(method_lines[0])
        end = int(method_lines[1])

    method_name = extract_method_name(pid, vid, start, end)
    apply_patch(pid, vid, start, end, sid, mode)

    mean_fdm, mean_ldm, mean_frm, mean_lrm = measure_mem(pid, vid, sid, mode, iter_num, int(dev_test), int(reg_test), method_name)

    print(mean_fdm, mean_ldm)
    print(mean_frm, mean_lrm)