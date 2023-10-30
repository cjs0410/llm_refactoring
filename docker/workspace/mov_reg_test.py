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
        os.system(f"mv /tmp/{pid}-{vid}f-reg-test ./reg_tests")
        time.sleep(1)
