class Palindrome
    def initialize
        @stack = Array.new
        @queue = Array.new
    end

    def pushCharacter ch
        @stack.push(ch)
    end

    def enqueueCharacter ch
        @queue.push(ch)
    end

    def popCharacter
        return @stack.pop
    end

    def dequeueCharacter
        return @queue.shift
    end
end

# Read the string s.
s = gets
# Create the Palindrome class object.
p = Palindrome.new()
n = s.length
# Push all the characters of string s to stack.
for i in 0...n
    p.pushCharacter(s[i])
end
# Enqueue all the characters of string s to queue.
for i in 0...n
    p.enqueueCharacter(s[i])
end

f = true
# Pop the top character from stack.
# Dequeue the first character from queue.
# Compare both the characters.
for i in 0...n
    if p.popCharacter() != p.dequeueCharacter()
        f = false
        break
    end
end

# Finally print whether string s is palindrome or not.
if f
    puts("The word, " + s + ", is a palindrome.")
else
    puts("The word, " + s + ", is not a palindrome.")
end
