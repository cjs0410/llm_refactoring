import os
import re
import csv

if __name__ == "__main__":
    # f = open('./result.csv','r')
    # rdr = csv.reader(f)
    # test_set = set()

    # total = 0
    # compile = 0
    # dev_test = 0
    # reg_test = 0
    # correct = 0

    # for line in rdr:
    #     total += 1
    #     test_set.add((line[0], line[1], line[2]))
    #     if line[3] == '1':
    #         compile += 1
    #     if line[4] == '1':
    #         dev_test += 1
    #     if line[5] == '1':
    #         reg_test += 1
    #     if line[4] == '1' and line[5] == '1':
    #         correct += 1
    # f.close()

    # print(f"total: {total}\ncompiled: {compile}\ndev_test: {dev_test}\nreg_test: {reg_test}\ncorrect: {correct}")
    # print(f"compile rate: {round(compile * 100 / total, 2)}%")
    # print(f"correct rate: {round(correct * 100 / compile, 2)}%")

    # f = open('./results/base.csv','r')
    # rdr = csv.reader(f)

    # total = 0
    # compile = 0
    # dev_test = 0
    # reg_test = 0
    # correct = 0

    # for line in rdr:
    #     if line[0] == 'pid':
    #         continue
        
    #     if line[3] == 'normal':
    #         total += 1
    #         test_set.remove((line[0], line[1], line[2]))
    #         if line[4] == '1':
    #             compile += 1
    #         if line[5] == '1':
    #             dev_test += 1
    #         if line[6] == '1':
    #             reg_test += 1
    #         if line[5] == '1' and line[6] == '1':
    #             correct += 1
    # f.close()

    # print(f"total: {total}\ncompiled: {compile}\ndev_test: {dev_test}\nreg_test: {reg_test}\ncorrect: {correct}")
    # print(f"compile rate: {round(compile * 100 / total, 2)}%")
    # print(f"correct rate: {round(correct * 100 / compile, 2)}%")
    # print(test_set)


    f = open('./results/len.csv','r')
    rdr = csv.reader(f)

    total = 0
    compile = 0
    normal_compile = 0
    normal_correct = 0

    time_compile = 0
    time_correct = 0

    mem_compile = 0
    mem_correct = 0

    dev_test = 0
    reg_test = 0
    diff = 0
    shorter = 0

    correct = 0

    for line in rdr:
        if line[0] == 'pid':
            continue
        total += 1
        if line[4] == '1':
            compile += 1
            if line[3] == 'normal':
                normal_compile += 1
            if line[3] == 'time':
                time_compile += 1
            if line[3] == 'mem':
                mem_compile += 1

        if line[4] == '1' and line[5] == '1' and line[6] == '1':
            correct += 1
            if line[3] == 'normal':
                normal_correct += 1
            if line[3] == 'time':
                time_correct += 1
            if line[3] == 'mem':
                mem_correct += 1

            if int(line[7]) -  int(line[8]) > 0:
                shorter += 1
                diff += int(line[7]) -  int(line[8])
    f.close()

    print(f"correct rate: {round(correct * 100 / compile, 2)}%")
    print(normal_compile, time_compile, mem_compile)
    print(normal_correct, time_correct, mem_correct)
    print(f"total: {total}, compile: {compile}, correct: {correct}, shorter: {shorter}")
    print(f"shorten rate: {round(shorter * 100 / correct, 2)}%")
    print(f"mean shorten length: {round(diff / correct, 2)} chars")


    f = open('./results/time.csv','r')
    rdr = csv.reader(f)

    normal_dev_fast = 0
    normal_reg_fast = 0
    normal_fast = 0

    time_dev_fast = 0  
    time_reg_fast = 0
    time_fast = 0

    mem_dev_fast = 0
    mem_reg_fast = 0
    mem_fast = 0


    for line in rdr:
        if line[0] == 'pid':
            continue

        if line[3] == 'normal':
            if float(line[5]) != 0 and float(line[7]) != 0:
                # normal_correct += 1
                if float(line[4]) - float(line[5]) > 0:
                    normal_dev_fast += 1
                if float(line[6]) - float(line[7]) > 0:
                    normal_reg_fast += 1
                if float(line[4]) - float(line[5]) > 0 and float(line[6]) - float(line[7]) > 0:
                    normal_fast += 1
        
        if line[3] == 'time':
            if float(line[5]) != 0 and float(line[7]) != 0:
                # time_correct += 1
                if float(line[4]) - float(line[5]) > 0:
                    time_dev_fast += 1
                if float(line[6]) - float(line[7]) > 0:
                    time_reg_fast += 1
                if float(line[4]) - float(line[5]) > 0 and float(line[6]) - float(line[7]) > 0:
                    time_fast += 1

        if line[3] == 'mem':
            if float(line[5]) != 0 and float(line[7]) != 0:
                # mem_correct += 1
                if float(line[4]) - float(line[5]) > 0:
                    mem_dev_fast += 1
                if float(line[6]) - float(line[7]) > 0:
                    mem_reg_fast += 1
                if float(line[4]) - float(line[5]) > 0 and float(line[6]) - float(line[7]) > 0:
                    mem_fast += 1

    f.close()

    print(f"normal correct rate: {round(normal_correct * 100 / normal_compile, 2)}%, normal_fast: {normal_fast}")
    print(f"normal dev faster rate: {round(normal_dev_fast * 100 / normal_correct, 2)}%")
    print(f"normal reg faster rate: {round(normal_reg_fast * 100 / normal_correct, 2)}%")
    print(f"normal faster rate: {round(normal_fast * 100 / normal_correct, 2)}%")

    print(f"time correct rate: {round(time_correct * 100 / time_compile, 2)}%, time_fast: {time_fast}")
    print(f"time dev faster rate: {round(time_dev_fast * 100 / time_correct, 2)}%")
    print(f"time reg faster rate: {round(time_reg_fast * 100 / time_correct, 2)}%")
    print(f"time faster rate: {round(time_fast * 100 / time_correct, 2)}%")

    print(f"mem correct rate: {round(mem_correct * 100 / mem_compile, 2)}%, mem_fast: {mem_fast}")
    print(f"mem dev faster rate: {round(mem_dev_fast * 100 / mem_correct, 2)}%")
    print(f"mem reg faster rate: {round(mem_reg_fast * 100 / mem_correct, 2)}%")
    print(f"mem faster rate: {round(mem_fast * 100 / mem_correct, 2)}%")


    print(f"total faster rate: {round((normal_fast + time_fast + mem_fast) * 100 / correct, 2)}%")