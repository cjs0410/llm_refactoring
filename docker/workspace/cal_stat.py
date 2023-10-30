import os
import re
import csv

if __name__ == "__main__":
    f = open('./data/result.csv','r')
    rdr = csv.reader(f)

    total = 0
    compile = 0
    dev_test = 0
    reg_test = 0
    correct = 0

    for line in rdr:
        total += 1
        if line[3] == '1':
            compile += 1
        if line[4] == '1':
            dev_test += 1
        if line[5] == '1':
            reg_test += 1
        if line[4] == '1' and line[5] == '1':
            correct += 1
    f.close()

    print(f"total: {total}\ncompiled: {compile}\ndev_test: {dev_test}\nreg_test: {reg_test}\ncorrect: {correct}")
    print(f"compile rate: {round(compile * 100 / total, 2)}%")
    print(f"correct rate: {round(correct * 100 / compile, 2)}%")