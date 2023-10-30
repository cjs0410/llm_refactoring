import os
import time
import re
import csv
import json
import sys


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

def measure_time(pid, vid, iter_num, dev_test, reg_test):
    fixed_dir = f"/tmp/{pid}-{vid}f"
    mod_dir = f"/tmp/{pid}-{vid}m"
    
    fixed_dev_time = 0
    llm_dev_time = 0
    fixed_reg_time = 0
    llm_reg_time = 0

    if dev_test == 1:
        for i in range(iter_num):
            # execute developer test
            fixed_start = time.time()
            os.system(f"cd {fixed_dir} && defects4j test")
            fixed_end = time.time()
            fixed_dev_time += fixed_end - fixed_start

            llm_start = time.time()
            os.system(f"cd {mod_dir} && defects4j test")
            llm_end = time.time()
            llm_dev_time += llm_end - llm_start

    if reg_test == 1:
        for i in range(iter_num):
            # execute regression test
            fixed_start = time.time()
            os.system(f"cd {fixed_dir} && defects4j test -s /root/workspace/reg_tests/{pid}-{vid}f-reg-test/{pid}/evosuite/1/{pid}-{vid}f-evosuite.1.tar.bz2")
            fixed_end = time.time()
            fixed_reg_time += fixed_end - fixed_start

            llm_start = time.time()
            os.system(f"cd {mod_dir} && defects4j test -s /root/workspace/reg_tests/{pid}-{vid}f-reg-test/{pid}/evosuite/1/{pid}-{vid}f-evosuite.1.tar.bz2")
            llm_end = time.time()
            llm_reg_time += llm_end - llm_start
    
    mean_fdt = fixed_dev_time / iter_num
    mean_ldt = llm_dev_time / iter_num
    mean_frt = fixed_reg_time / iter_num
    mean_lrt = llm_reg_time / iter_num
    
    return mean_fdt, mean_ldt, mean_frt, mean_lrt


def measure_mem(pid, vid, sid, mode, iter_num, dev_test, reg_test):
    fixed_dir = f"/tmp/{pid}-{vid}f"
    mod_dir = f"/tmp/{pid}-{vid}m"
    
    fixed_dev_mem = 0
    llm_dev_mem = 0
    fixed_reg_mem = 0
    llm_reg_mem = 0

    if dev_test == 1:
        for i in range(iter_num):
            if os.path.exists(f'''{fixed_dir}/fixed_dev.recording.jfr'''):
                os.system(f"rm -rf {fixed_dir}/fixed_dev.recording.jfr")
            if os.path.exists(f'''{mod_dir}/llm_dev_{mode}_{sid}.recording.jfr'''):
                os.system(f"rm -rf {mod_dir}/llm_dev_{mode}_{sid}.recording.jfr")

            # generate jrf file
            os.system(f'''cd {fixed_dir} && JAVA_TOOL_OPTIONS="-Dfile.encoding=UTF8 -XX:+UnlockCommercialFeatures -XX:+FlightRecorder -XX:StartFlightRecording=dumponexit=true,settings=profile,filename=fixed_dev.recording.jfr" defects4j test''')
            os.system(f'''cd {mod_dir} && JAVA_TOOL_OPTIONS="-Dfile.encoding=UTF8 -XX:+UnlockCommercialFeatures -XX:+FlightRecorder -XX:StartFlightRecording=dumponexit=true,settings=profile,filename=llm_dev_{mode}_{sid}.recording.jfr" defects4j test''')

            if not os.path.exists(f'''./data/{pid}-{vid}b/mem_profile/fixed_dev.recording.jfr'''):
                os.system(f'''cp {fixed_dir}/fixed_dev.recording.jfr ./data/{pid}-{vid}b/mem_profile/fixed_dev.recording.jfr''')
            if not os.path.exists(f'''./data/{pid}-{vid}b/mem_profile/llm_dev_{mode}_{sid}.recording.jfr'''):
                os.system(f'''cp {mod_dir}/llm_dev_{mode}_{sid}.recording.jfr ./data/{pid}-{vid}b/mem_profile/llm_dev_{mode}_{sid}.recording.jfr''')

            os.system(f'''cd {fixed_dir} && jfr print --json --stack-depth 64 --events jdk.ObjectAllocationInNewTLAB fixed_dev.recording.jfr > /tmp/fixed_dev_mem.json''')
            os.system(f'''cd {mod_dir} && jfr print --json --stack-depth 64 --events jdk.ObjectAllocationInNewTLAB llm_dev_{mode}_{sid}.recording.jfr > /tmp/llm_dev_mem.json''')

            with open('/tmp/fixed_dev_mem.json', 'r') as f:
                fixed_dev = json.load(f)
            with open('/tmp/llm_dev_mem.json', 'r') as f:
                llm_dev = json.load(f)

            test_val = 0
            for event in fixed_dev['recording']['events']:
                test_val += event['values']['allocationSize']
                fixed_dev_mem += event['values']['allocationSize']
            print(test_val)
            for event in llm_dev['recording']['events']:
                llm_dev_mem += event['values']['allocationSize']

    if reg_test == 1:
        for i in range(iter_num):
            if os.path.exists(f'''{fixed_dir}/fixed_reg.recording.jfr'''):
                os.system(f"rm -rf {fixed_dir}/fixed_reg.recording.jfr")
            if os.path.exists(f'''{mod_dir}/llm_reg_{mode}_{sid}.recording.jfr'''):
                os.system(f"rm -rf {mod_dir}/llm_reg_{mode}_{sid}.recording.jfr")

            # generate jrf file
            os.system(f'''cd {fixed_dir} && JAVA_TOOL_OPTIONS="-Dfile.encoding=UTF8 -XX:+UnlockCommercialFeatures -XX:+FlightRecorder -XX:StartFlightRecording=dumponexit=true,settings=profile,filename=fixed_reg.recording.jfr" defects4j test -s /root/workspace/reg_tests/{pid}-{vid}f-reg-test/{pid}/evosuite/1/{pid}-{vid}f-evosuite.1.tar.bz2''')
            os.system(f'''cd {mod_dir} && JAVA_TOOL_OPTIONS="-Dfile.encoding=UTF8 -XX:+UnlockCommercialFeatures -XX:+FlightRecorder -XX:StartFlightRecording=dumponexit=true,settings=profile,filename=llm_reg_{mode}_{sid}.recording.jfr" defects4j test -s /root/workspace/reg_tests/{pid}-{vid}f-reg-test/{pid}/evosuite/1/{pid}-{vid}f-evosuite.1.tar.bz2''')
            
            if not os.path.exists(f'''./data/{pid}-{vid}b/mem_profile/fixed_reg.recording.jfr'''):
                os.system(f'''cp {fixed_dir}/fixed_reg.recording.jfr ./data/{pid}-{vid}b/mem_profile/fixed_reg.recording.jfr''')
            if not os.path.exists(f'''./data/{pid}-{vid}b/mem_profile/llm_reg_{mode}_{sid}.recording.jfr'''):
                os.system(f'''cp {mod_dir}/llm_reg_{mode}_{sid}.recording.jfr ./data/{pid}-{vid}b/mem_profile/llm_reg_{mode}_{sid}.recording.jfr''')

            os.system(f'''cd {fixed_dir} && jfr print --json --stack-depth 64 --events jdk.ObjectAllocationInNewTLAB fixed_reg.recording.jfr > /tmp/fixed_reg_mem.json''')
            os.system(f'''cd {mod_dir} && jfr print --json --stack-depth 64 --events jdk.ObjectAllocationInNewTLAB llm_reg_{mode}_{sid}.recording.jfr > /tmp/llm_reg_mem.json''')

            with open('/tmp/fixed_reg_mem.json', 'r') as f:
                fixed_reg = json.load(f)
            with open('/tmp/llm_reg_mem.json', 'r') as f:
                llm_reg = json.load(f)

            for event in fixed_reg['recording']['events']:
                fixed_reg_mem += event['values']['allocationSize']
            for event in llm_reg['recording']['events']:
                llm_reg_mem += event['values']['allocationSize']

    mean_fdm = fixed_dev_mem / iter_num
    mean_ldm = llm_dev_mem / iter_num
    mean_frm = fixed_reg_mem / iter_num
    mean_lrm = llm_reg_mem / iter_num

    return mean_fdm, mean_ldm, mean_frm, mean_lrm

if __name__ == "__main__":
    if sys.argv[1] == 'check':
        sample_cnt = 5
        iter_num = 2

        fieldnames = ['pid', 'vid', 'sid', 'mode', 'compile', 'dev_test', 'reg_test']
        modes = ['normal', 'time', 'mem']

        if not os.path.exists("./results/base.csv"):
            f = open("./results/base.csv", "w", errors='ignore')
            writer = csv.DictWriter(f, fieldnames=fieldnames)
            writer.writeheader()
            f.close()

        for dname in sorted(os.listdir("./data")):
            try:
                pid, vid = dname.split("-")
                vid = vid[:-1]
            except:
                continue
            
            # if pid != 'Jsoup' or vid != '1':
            #     continue

            mod_dir = f"/tmp/{pid}-{vid}m"
            fixed_dir = f"/tmp/{pid}-{vid}f"

            if not os.path.exists(fixed_dir):
                os.system(f"defects4j checkout -p {pid} -v {vid}f -w {fixed_dir}")

            if not os.path.exists(f'''./data/{pid}-{vid}b/mem_profile/'''):
                os.system(f'''mkdir ./data/{pid}-{vid}b/mem_profile/''')

            with open(f"./data/{dname}/method_line.txt", "r", errors='ignore') as f:
                method_lines = f.readlines()
                start = int(method_lines[0])
                end = int(method_lines[1])
            # print(start, end)

            for mode in modes:
                for i in range(sample_cnt):
                    sid = i + 1
                    exist = False
            
                    f = open('./results/base.csv','r')
                    rdr = csv.reader(f)
                    
                    for line in rdr:
                        # print(line)
                        if str(pid) == line[0] and str(vid) == line[1] and str(i+1) == line[2] and str(mode) == line[3]:
                            # print(line)
                            exist = True
                    f.close()

                    if exist:
                        continue

                    compile = 0
                    dev_test = 0
                    reg_test = 0

                    os.system(f"rm -rf {mod_dir}")
                    os.system(f"defects4j checkout -p {pid} -v {vid}f -w {mod_dir}")

                    apply_patch(pid, vid, start, end, sid, mode)

                    os.system(f"cd {mod_dir} && defects4j compile 2> /tmp/compile.txt")
                    c = open("/tmp/compile.txt", "r", errors='ignore')
                    comp = c.read()
                    # print(comp)
                    if "BUILD FAILED" not in comp:
                        compile = 1

                        # execute developer test
                        os.system(f"cd {mod_dir} && defects4j test > /tmp/dev_test.txt")

                        d = open("/tmp/dev_test.txt", "r", errors='ignore')
                        dev = d.read()
                        # print(dev)
                        if "Failing tests: 0" in dev:
                            dev_test = 1

                        # execute regression test
                        os.system(f"cd {fixed_dir} && defects4j test -s /root/workspace/reg_tests/{pid}-{vid}f-reg-test/{pid}/evosuite/1/{pid}-{vid}f-evosuite.1.tar.bz2 > /tmp/reg_test1.txt")
                        
                        os.system(f"cd {mod_dir} && defects4j test -s /root/workspace/reg_tests/{pid}-{vid}f-reg-test/{pid}/evosuite/1/{pid}-{vid}f-evosuite.1.tar.bz2 > /tmp/reg_test2.txt")

                        r1 = open("/tmp/reg_test1.txt", "r", errors='ignore')
                        r2 = open("/tmp/reg_test2.txt", "r", errors='ignore')
                        reg1 = r1.read()
                        reg2 = r2.read()
                        # print(reg1, reg2)
                        if reg1 == reg2:
                            reg_test = 1
            
                        d.close()
                        r1.close()
                        r2.close()

                    row = {'pid': pid, 
                        'vid': vid, 
                        'sid': sid, 
                        'mode': mode, 
                        'compile': compile, 
                        'dev_test': dev_test, 
                        'reg_test': reg_test, 
                        }
                    with open("./results/base.csv", "a", errors='ignore') as r:
                        writer = csv.DictWriter(r, fieldnames=fieldnames)
                        writer.writerow(row)

    if sys.argv[1] == 'time':
        sample_cnt = 5
        iter_num = 2

        fieldnames = ['pid', 'vid', 'sid', 'mode', 'fixed_dev_time', 'llm_dev_time', 'fixed_reg_time', 'llm_reg_time']
        modes = ['normal', 'time', 'mem']

        if not os.path.exists("./results/time.csv"):
            f = open("./results/time.csv", "w", errors='ignore')
            writer = csv.DictWriter(f, fieldnames=fieldnames)
            writer.writeheader()
            f.close()

        f = open('./results/base.csv','r')
        base = csv.reader(f)
        
        for line in base:
            pid, vid, sid, mode, compile, dev_test, reg_test = line

            mod_dir = f"/tmp/{pid}-{vid}m"
            fixed_dir = f"/tmp/{pid}-{vid}f"
            exist = False
    
            t = open('./results/time.csv','r')
            time_data = csv.reader(t)
            
            for data in time_data:
                if str(pid) == data[0] and str(vid) == data[1] and str(sid) == data[2] and str(mode) == data[3]:
                    exist = True
            t.close()

            if exist:
                continue

            mean_fdt = 0
            mean_ldt = 0
            mean_frt = 0
            mean_lrt = 0

            os.system(f"rm -rf {fixed_dir}")
            os.system(f"defects4j checkout -p {pid} -v {vid}f -w {fixed_dir}")
            os.system(f"rm -rf {mod_dir}")
            os.system(f"defects4j checkout -p {pid} -v {vid}f -w {mod_dir}")

            with open(f"./data/{pid}-{vid}b/method_line.txt", "r", errors='ignore') as m:
                method_lines = m.readlines()
                start = int(method_lines[0])
                end = int(method_lines[1])

            apply_patch(pid, vid, start, end, sid, mode)

            mean_fdt, mean_ldt, mean_frt, mean_lrt = measure_time(pid, vid, iter_num, int(dev_test), int(reg_test))

            row = {'pid': pid, 
                'vid': vid, 
                'sid': sid, 
                'mode': mode, 
                'fixed_dev_time': mean_fdt, 
                'llm_dev_time': mean_ldt, 
                'fixed_reg_time': mean_frt, 
                'llm_reg_time': mean_lrt, 
                }
            
            with open("./results/time.csv", "a", errors='ignore') as r:
                writer = csv.DictWriter(r, fieldnames=fieldnames)
                writer.writerow(row)
        f.close()

    if sys.argv[1] == 'mem':
        sample_cnt = 5
        iter_num = 2

        fieldnames = ['pid', 'vid', 'sid', 'mode', 'fixed_dev_mem', 'llm_dev_mem', 'fixed_reg_mem', 'llm_reg_mem']
        modes = ['normal', 'time', 'mem']

        if not os.path.exists("./results/mem.csv"):
            f = open("./results/mem.csv", "w", errors='ignore')
            writer = csv.DictWriter(f, fieldnames=fieldnames)
            writer.writeheader()
            f.close()

        f = open('./results/base.csv','r')
        base = csv.reader(f)
        
        for line in base:
            pid, vid, sid, mode, compile, dev_test, reg_test = line
            mod_dir = f"/tmp/{pid}-{vid}m"
            fixed_dir = f"/tmp/{pid}-{vid}f"
            exist = False
    
            t = open('./results/mem.csv','r')
            mem_data = csv.reader(t)
            
            for data in mem_data:
                if str(pid) == data[0] and str(vid) == data[1] and str(sid) == data[2] and str(mode) == data[3]:
                    exist = True
            t.close()

            if exist:
                continue

            mean_fdm = 0
            mean_ldm = 0
            mean_frm = 0
            mean_lrm = 0

            if not os.path.exists(fixed_dir):
                os.system(f"defects4j checkout -p {pid} -v {vid}f -w {fixed_dir}")
            os.system(f"rm -rf {mod_dir}")
            os.system(f"defects4j checkout -p {pid} -v {vid}f -w {mod_dir}")

            with open(f"./data/{pid}-{vid}b/method_line.txt", "r", errors='ignore') as m:
                method_lines = m.readlines()
                start = int(method_lines[0])
                end = int(method_lines[1])

            apply_patch(pid, vid, start, end, sid, mode)

            mean_fdm, mean_ldm, mean_frm, mean_lrm = measure_mem(pid, vid, sid, mode, iter_num, int(dev_test), int(reg_test))

            row = {'pid': pid, 
                'vid': vid, 
                'sid': sid, 
                'mode': mode, 
                'fixed_dev_mem': mean_fdm, 
                'llm_dev_mem': mean_ldm, 
                'fixed_reg_mem': mean_frm, 
                'llm_reg_mem': mean_lrm
                }
            
            with open("./results/mem.csv", "a", errors='ignore') as r:
                writer = csv.DictWriter(r, fieldnames=fieldnames)
                writer.writerow(row)
        f.close()


    if sys.argv[1] == 'len':
        sample_cnt = 5
        iter_num = 2

        fieldnames = ['pid', 'vid', 'sid', 'mode', 'fixed_len', 'llm_len']
        modes = ['normal', 'time', 'mem']

        if not os.path.exists("./results/len.csv"):
            f = open("./results/len.csv", "w", errors='ignore')
            writer = csv.DictWriter(f, fieldnames=fieldnames)
            writer.writeheader()
            f.close()