import os
import time

os.system("defects4j pids > /tmp/pids")
sample_cnt = 0

p = open("/tmp/pids", "r")
for pid in p:
    pid = pid.replace('\n', '')
    # if pid != "Math":
    #     continue
    os.system(f"defects4j bids -p {pid} > /tmp/vids")
    result = {}
    v = open("/tmp/vids", "r")
    for vid in v.readlines():
        vid = vid.replace('\n', '')
        os.system(f"gen_tests.pl -g evosuite -p {pid} -v {vid}f -n 1 -o /tmp/{pid}-{vid}f-reg-test -b 180")
        time.sleep(1)
