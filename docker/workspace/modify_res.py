import os
import csv

if __name__ == "__main__":
    f = open('./results/base.csv','r')
    base = csv.reader(f)
    
    for line in base:
        pid, vid, sid, mode, compile, dev_test, reg_test = line
        if pid == 'pid':
            continue
        mod_dir = f"/tmp/{pid}-{vid}m"
        fixed_dir = f"/tmp/{pid}-{vid}f"
        exist = False

        t = open('./results/mem_mod.csv','r')
        mem_data = csv.reader(t)
        lines = []
        for data in mem_data:
            if str(pid) == data[0] and str(vid) == data[1] and str(sid) == data[2] and str(mode) == data[3]:
                if int(dev_test) != 1:
                    data[4] = None
                    data[5] = None
                if int(reg_test) != 1:
                    data[6] = None
                    data[7] = None
            lines.append(data)

        t.close()
        n = open('./results/mem_mod.csv', 'w')
        new = csv.writer(n)
        new.writerows(lines)
        n.close()