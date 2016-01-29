def is_funny(word):
    left, right = 1, len(word) - 2
    while left <= right:
        if abs(ord(word[left]) - ord(word[left - 1])) != \
           abs(ord(word[right + 1]) - ord(word[right])):
            return False
        left, right = left + 1, right - 1

    return True

testcases = int(raw_input())
for _ in xrange(testcases):
    word = raw_input().strip()
    if is_funny(word):
        print "Funny"
    else:
        print "Not Funny"
