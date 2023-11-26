import os
import time
import re
import csv
import json
import sys
import pandas as pd

JAVA_ANALYZER="java_analyzer/target/java-analyzer-1.0-SNAPSHOT-shaded.jar"

def extract_method_name(pid, vid, start, end):
    files_to_analyze = set()
    method_name = None
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
                    elif node['type'] == "field":
                        method_name = '<clinit>'
                    elif node['type'] == "constructor":
                        method_name = '<init>'
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

def measure_time(pid, vid, iter_num, dev_test, reg_test, method_name):
    buggy_dir = f"/tmp/{pid}-{vid}b"
    fixed_dir = f"/tmp/{pid}-{vid}f"
    mod_dir = f"/tmp/{pid}-{vid}m"
    
    fixed_dev_time = 0
    llm_dev_time = 0
    fixed_reg_time = 0
    llm_reg_time = 0

    print(method_name)

    if dev_test == 1:
        if not os.path.exists(f"{buggy_dir}/sfl"):
            os.system(f"sh run_gzoltar.sh {pid} {vid}")
        os.system(f"cd {buggy_dir}/sfl/txt")
        m = open(f'{buggy_dir}/sfl/txt/matrix.txt', 'r')
        lines = m.readlines()
        
        t = open(f'{buggy_dir}/sfl/txt/tests.csv', 'r')
        tests = csv.reader(t)
        tests = [test for test in tests][1:]
        s = open(f'{buggy_dir}/sfl/txt/spectra.csv', 'r')
        spectra = csv.reader(s)
        spectra = [stmt for stmt in spectra][1:]

        test_indices = set()
        cov_tests = set()
        
        for stmt_index, stmt in enumerate(spectra):
            if stmt[0].split('(')[0].split('#')[-1] == method_name:
                print(stmt_index, stmt)
                for test_index, line in enumerate(lines):
                    if line.split(' ')[:-1][stmt_index] == '1':
                        # test_indices.add(test_index)
                        print(line.split(' ')[stmt_index], tests[test_index])
                        cov_tests.add(tests[test_index][0].replace('#', '::'))
        print(cov_tests)
        # for index in test_indices:
        #     cov_tests.add(tests[index][0].replace('#', '::'))
        # print(len(cov_tests))

        # for cov_test in cov_tests:
        #     os.system(f"cd {buggy_dir} && defects4j test -t {cov_test}")

        m.close()
        t.close()
        s.close()

        for i in range(iter_num):
            os.system(f"cd {fixed_dir} && rm -rf TEST-*")
            os.system(f"cd {mod_dir} && rm -rf TEST-*")

            os.system(f"cd {fixed_dir} && defects4j test")
            os.system(f"cd {mod_dir} && defects4j test")

            for cov_test in cov_tests:
                with open(f"{fixed_dir}/TEST-{cov_test.split('::')[0]}.txt", 'r') as f_c:
                    for line in f_c.readlines():
                        tc = re.match("Testcase: (.*) took (.*) sec", line)
                        if tc is None:
                            continue
                        if tc.group(1) == cov_test.split('::')[-1]:
                            fixed_dev_time += float(tc.group(2))

                with open(f"{mod_dir}/TEST-{cov_test.split('::')[0]}.txt", 'r') as l_c:
                    for line in l_c.readlines():
                        tc = re.match("Testcase: (.*) took (.*) sec", line)
                        if tc is None:
                            continue
                        if tc.group(1) == cov_test.split('::')[-1]:
                            llm_dev_time += float(tc.group(2))
            

    # if reg_test == 1:
    #     for i in range(iter_num):
    #         # execute regression test
    #         fixed_start = time.time()
    #         os.system(f"cd {fixed_dir} && defects4j test -s /root/workspace/reg_tests/{pid}-{vid}f-reg-test/{pid}/evosuite/1/{pid}-{vid}f-evosuite.1.tar.bz2")
    #         fixed_end = time.time()
    #         fixed_reg_time += fixed_end - fixed_start

    #         llm_start = time.time()
    #         os.system(f"cd {mod_dir} && defects4j test -s /root/workspace/reg_tests/{pid}-{vid}f-reg-test/{pid}/evosuite/1/{pid}-{vid}f-evosuite.1.tar.bz2")
    #         llm_end = time.time()
    #         llm_reg_time += llm_end - llm_start
    
    mean_fdt = fixed_dev_time / iter_num
    mean_ldt = llm_dev_time / iter_num
    # mean_frt = fixed_reg_time / iter_num
    # mean_lrt = llm_reg_time / iter_num
    
    return mean_fdt, mean_ldt, mean_frt, mean_lrt

if __name__ == "__main__":
    pid, vid, sid, mode, compile, dev_test, reg_test = 'Chart', '23', '1', 'normal', '1', '1', '1'
    mod_dir = f"/tmp/{pid}-{vid}m"
    fixed_dir = f"/tmp/{pid}-{vid}f"

    iter_num = 5
    mean_fdt = 0
    mean_ldt = 0
    mean_frt = 0
    mean_lrt = 0

    # if not os.path.exists(fixed_dir):
    os.system(f"rm -rf {fixed_dir}")
    os.system(f"defects4j checkout -p {pid} -v {vid}f -w {fixed_dir}")
    # if not os.path.exists(mod_dir):
    os.system(f"rm -rf {mod_dir}")
    os.system(f"defects4j checkout -p {pid} -v {vid}f -w {mod_dir}")

    os.system(f"cd {fixed_dir} && defects4j compile")
    os.system(f"cd {mod_dir} && defects4j compile")

    with open(f"./data/{pid}-{vid}b/method_line.txt", "r", errors='ignore') as m:
        method_lines = m.readlines()
        start = int(method_lines[0])
        end = int(method_lines[1])

    method_name = extract_method_name(pid, vid, start, end)
    apply_patch(pid, vid, start, end, sid, mode)
    mean_fdt, mean_ldt, mean_frt, mean_lrt = measure_time(pid, vid, iter_num, int(dev_test), int(reg_test), method_name)

    print(mean_fdt, mean_ldt)
    print(mean_frt, mean_lrt)