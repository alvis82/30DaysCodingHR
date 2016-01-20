import re

s = raw_input().strip()
words = re.split("[!,'@+\\\\?\\s\\.\\[\\]\\_]+", s)
if words[0] == "": del words[0]
if words[-1] == "": words.pop()
print len(words)
for word in words:
    print word
