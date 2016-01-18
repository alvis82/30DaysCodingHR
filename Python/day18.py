import collections

class Palindrome:
    def __init__(self):
        self.stack = []
        self.queue = collections.deque()

    def pushCharacter(self, ch):
        self.stack.append(ch)

    def enqueueCharacter(self, ch):
        self.queue.append(ch)

    def popCharacter(self):
        return self.stack.pop()

    def dequeueCharacter(self):
        return self.queue.popleft();

# Read the string s.
s = raw_input()
# Create the Palindrome class object.
p = Palindrome()

n = len(s)
# Push all the characters of string s to stack.
for i in range(n):
    p.pushCharacter(s[i])
# Enqueue all the characters of string s to queue.
for i in range(n):
    p.enqueueCharacter(s[i])

f = True
# Pop the top character from stack.
# Dequeue the first character from queue.
# Compare both the characters.
for i in range(n):
    if p.popCharacter() != p.dequeueCharacter():
        f = False
        break

# Finally print whether string s is palindrome or not.
if f:
    sys.stdout.write ("The word, " + s + ", is a palindrome.")
else:
    sys.stdout.write ("The word, " + s + ", is not a palindrome.")
