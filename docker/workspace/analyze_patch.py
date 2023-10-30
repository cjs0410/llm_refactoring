import os
import time
import re
import csv


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

def measure_time(pid, vid, num):
    mod_dir = f"/tmp/{pid}-{vid}m"
    compile = 0
    dev_test = 0
    reg_test = 0
    exist = 0
    
    fixed_dev_time = 0
    llm_dev_time = 0
    fixed_reg_time = 0
    llm_reg_time = 0

    for i in range(num):
        # execute developer test
        fixed_start = time.time()
        os.system(f"cd {fixed_dir} && defects4j test")
        fixed_end = time.time()
        fixed_dev_time += fixed_end - fixed_start

        llm_start = time.time()
        os.system(f"cd {mod_dir} && defects4j test")
        llm_end = time.time()
        llm_dev_time += llm_end - llm_start

        # execute regression test
        fixed_start = time.time()
        os.system(f"cd {fixed_dir} && defects4j test -s /root/workspace/reg_tests/{pid}-{vid}f-reg-test/{pid}/evosuite/1/{pid}-{vid}f-evosuite.1.tar.bz2")
        fixed_end = time.time()
        fixed_reg_time += fixed_end - fixed_start

        llm_start = time.time()
        os.system(f"cd {mod_dir} && defects4j test -s /root/workspace/reg_tests/{pid}-{vid}f-reg-test/{pid}/evosuite/1/{pid}-{vid}f-evosuite.1.tar.bz2")
        llm_end = time.time()
        llm_reg_time += llm_end - llm_start
    
    mean_fdt = fixed_dev_time / num
    mean_ldt = llm_dev_time / num
    mean_frt = fixed_reg_time / num
    mean_lrt = llm_reg_time / num
    
    return mean_fdt, mean_ldt, mean_frt, mean_lrt
    # row = {'pid': pid, 'vid': vid, 'sid': sid, 'compile': compile, 'dev_test': dev_test, 'reg_test': reg_test}
    # with open("./data/test.csv", "a", errors='ignore') as r:
    #     writer = csv.DictWriter(r, fieldnames=fieldnames)
    #     writer.writerow(row)


def measure_mem(pid, vid, num):
    mod_dir = f"/tmp/{pid}-{vid}m"
    compile = 0
    dev_test = 0
    reg_test = 0
    exist = 0
    
    fixed_dev_time = 0
    llm_dev_time = 0
    fixed_reg_time = 0
    llm_reg_time = 0

    os.system(f"cd {mod_dir} && defects4j compile 2> /tmp/compile.txt")
    c = open("/tmp/compile.txt", "r", errors='ignore')
    comp = c.read()
    # print(comp)
    if "BUILD FAILED" not in comp:
        compile = 1

        # generate jrf file
        os.system(f'''cd {mod_dir} && JAVA_TOOL_OPTIONS="-Dfile.encoding=UTF8 -XX:+UnlockCommercialFeatures -
XX:+FlightRecorder -
XX:StartFlightRecording=dumponexit=true,settings=profile,filename=tests.reco
rding.jfr" defects4j test''')

        d = open("/tmp/dev_test.txt", "r", errors='ignore')
        dev = d.read()
        print(dev)
        if "Failing tests: 0" in dev:
            dev_test = 1

        # generate jrf file
        os.system(f'''cd {mod_dir} && JAVA_TOOL_OPTIONS="-Dfile.encoding=UTF8 -XX:+UnlockCommercialFeatures -
XX:+FlightRecorder -
XX:StartFlightRecording=dumponexit=true,settings=profile,filename=tests.reco
rding.jfr" defects4j test -s /root/workspace/reg_tests/{pid}-{vid}f-reg-test/{pid}/evosuite/1/{pid}-{vid}f-evosuite.1.tar.bz2 > /tmp/reg_test2.txt''')
        
        r2 = open("/tmp/reg_test2.txt", "r", errors='ignore')
        reg1 = r1.read()
        reg2 = r2.read()
        print(reg1, reg2)
        if reg1 == reg2:
            reg_test = 1

        d.close()
        r1.close()
        r2.close()


if __name__ == "__main__":
    sample_cnt = 5
    iter_num = 10

    fieldnames = ['pid', 'vid', 'sid', 'mode', 'compile', 'dev_test', 'reg_test', 'fixed_dev_time', 'llm_dev_time', 'fixed_reg_time', 'llm_reg_time', 'fixed_dev_mem', 'llm_dev_mem', 'fixed_reg_mem', 'llm_reg_mem']
    modes = ['normal', 'time', 'mem']

    if not os.path.exists("./data/test.csv"):
        f = open("./data/test.csv", "w", errors='ignore')
        writer = csv.DictWriter(f, fieldnames=fieldnames)
        writer.writeheader()
        f.close()

    for dname in sorted(os.listdir("./data")):
        try:
            pid, vid = dname.split("-")
            vid = vid[:-1]
        except:
            continue
        
        if pid != 'Jsoup' or vid != '1':
            continue

        mod_dir = f"/tmp/{pid}-{vid}m"
        fixed_dir = f"/tmp/{pid}-{vid}f"

        if not os.path.exists(fixed_dir):
            os.system(f"defects4j checkout -p {pid} -v {vid}f -w {fixed_dir}")

        with open(f"./data/{dname}/method_line.txt", "r", errors='ignore') as f:
            method_lines = f.readlines()
            start = int(method_lines[0])
            end = int(method_lines[1])
        # print(start, end)

        for mode in modes:
            for i in range(sample_cnt):
                sid = i + 1
                exist = False
        
                f = open('./data/test.csv','r')
                rdr = csv.reader(f)
                
                for line in rdr:
                    # print(line)
                    if str(pid) == line[0] and str(vid) == line[1] and str(i+1) == line[2]:
                        # print(line)
                        exist = True
                f.close()

                if exist:
                    continue

                compile = 0
                dev_test = 0
                reg_test = 0
                exist = 0
                
                mean_fdt = 0
                mean_ldt = 0
                mean_frt = 0
                mean_lrt = 0



                # with open("./data/test.csv", "r", errors='ignore') as r:
                #     reader = csv.DictReader(r)
                #     for row in reader:
                #         if row["pid"] == pid and row["vid"] == vid and row["sid"] == str(sid):
                #             exist = 1
                # if exist == 1:
                #     continue

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
                    print(dev)
                    if "Failing tests: 0" in dev:
                        dev_test = 1

                    # execute regression test
                    os.system(f"cd {fixed_dir} && defects4j test -s /root/workspace/reg_tests/{pid}-{vid}f-reg-test/{pid}/evosuite/1/{pid}-{vid}f-evosuite.1.tar.bz2 > /tmp/reg_test1.txt")
                    
                    os.system(f"cd {mod_dir} && defects4j test -s /root/workspace/reg_tests/{pid}-{vid}f-reg-test/{pid}/evosuite/1/{pid}-{vid}f-evosuite.1.tar.bz2 > /tmp/reg_test2.txt")

                    r1 = open("/tmp/reg_test1.txt", "r", errors='ignore')
                    r2 = open("/tmp/reg_test2.txt", "r", errors='ignore')
                    reg1 = r1.read()
                    reg2 = r2.read()
                    print(reg1, reg2)
                    if reg1 == reg2:
                        reg_test = 1
        
                    d.close()
                    r1.close()
                    r2.close()

                    mean_fdt, mean_ldt, mean_frt, mean_lrt = measure_time(pid, vid, iter_num)


                row = {'pid': pid, 
                       'vid': vid, 
                       'sid': sid, 
                       'mode': mode, 
                       'compile': compile, 
                       'dev_test': dev_test, 
                       'reg_test': reg_test, 
                       'fixed_dev_time': mean_fdt, 
                       'llm_dev_time': mean_ldt, 
                       'fixed_reg_time': mean_frt, 
                       'llm_reg_time': mean_lrt, 
                    #    'fixed_dev_mem': , 
                    #    'llm_dev_mem': , 
                    #    'fixed_reg_mem': , 
                    #    'llm_reg_mem': 
                       }
                with open("./data/test.csv", "a", errors='ignore') as r:
                    writer = csv.DictWriter(r, fieldnames=fieldnames)
                    writer.writerow(row)