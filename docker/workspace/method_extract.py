import os
import re

JAVA_ANALYZER="java_analyzer/target/java-analyzer-1.0-SNAPSHOT-shaded.jar"

class JavaFileParsingError(Exception):
    pass

def analyze_src_file(self, src_path, overwrite=True, verbose=True):
    if not os.path.exists(os.path.join(self.tmp_dir, src_path)):
        return None
    # src_path = r"{}".format(src_path).replace(r'$', r'\$')\
    src_path = src_path.replace('$', '\$')
    output_path = self.get_range_path(src_path)
    
    
    if not os.path.exists(output_path.replace('\$', '$')) or (overwrite and output_path not in self.new_range_files):
        command = f'java -jar {JAVA_ANALYZER} {os.path.join(self.tmp_dir, src_path)} {output_path} {os.path.join(self.tmp_dir, self.dir_src_classes)} {self.cp_compile.replace(":", " ")}'
        if self.pid == "Mockito":
            command += " /defects4j/framework/projects/lib/junit-4.11.jar"
        if verbose:
            print(command)
        os.system(command)
    
    # output_path = r"{}".format(output_path).replace(r'\$', r'$')
    output_path = output_path.replace('\$', '$')
    if os.path.exists(output_path):
        self.new_range_files.add(output_path)
        return output_path
    else:
        raise JavaFileParsingError(f"Error while parsing java file: {src_path}")

def is_added_hunk(self, lines, i):
    for line in lines[i:]:
        if line.startswith("-"):
            continue
        # startswith + or any other letter
        else:
            # consecutive - and +
            if line.startswith("+"):
                return False
            # only -
            else:
                return True
    # only -
    return True

def buggy_lines(self, path_to_patch):
    # surrounding_line_width = self.decide_surrounding(path_to_patch)
    b_lines = set()
    with open(path_to_patch, "r", errors='ignore') as f:
        buggy_file, start_line = None, None
        lines = f.readlines()
        for i, l in enumerate(lines):
            if l.startswith("+++"):
                # buggy_file = l.strip()[6:].split('\t')[0].replace('$', '\$')
                # buggy_file = l.strip()[6:].replace('$', '\$')
                b = re.match("(\+*\s*)(\S*)", l)
                if b is None:
                    continue
                buggy_file = b.group(2).split("b/")[-1]
                continue
            m = re.match("^@@ -\d+,\d+ \+(\d+),\d+ @@", l)
            if m:
                start_line = int(m.group(1))
                current_line = start_line
                continue
            if l.startswith("diff"):
                buggy_file, start_line = None, None
                continue
            if buggy_file and start_line:
                # if l.startswith("-") and self.is_added_hunk(lines, i):
                if l.startswith("-"):
                    # surrounding lines
                    if self.is_added_hunk(lines, i):
                        b_lines.add((buggy_file, current_line - 1, True))
                        b_lines.add((buggy_file, current_line, True))
                    #for offset in range(1, surrounding_line_width+1):
                    #    lines.add((buggy_file, current_line - offset))
                    #    lines.add((buggy_file, current_line + offset - 1))
                else:
                    if l.startswith("+"):
                        b_lines.add((buggy_file, current_line, False))
                    current_line += 1
        
    return b_lines