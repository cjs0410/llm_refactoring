import os
import time

def measure_time(pid, vid):
    print("----------------regression test----------------")
    dev_start = time.time()
    os.system(f"cd /tmp/{pid}-{vid}f && defects4j test -s ../{pid}-{vid}f-reg-test/{pid}/evosuite/1/{pid}-{vid}f-evosuite.1.tar.bz2")
    dev_end = time.time()
    
    llm_start = time.time()
    os.system(f"cd /tmp/{pid}-{vid}m && defects4j test -s ../{pid}-{vid}f-reg-test/{pid}/evosuite/1/{pid}-{vid}f-evosuite.1.tar.bz2")
    llm_end = time.time()
    print(f"developer patch: {dev_end - dev_start:.5f} sec")
    print(f"llm patch: {llm_end - llm_start:.5f} sec")

pid, vid = "JacksonCore", "6"
measure_time(pid, vid)
