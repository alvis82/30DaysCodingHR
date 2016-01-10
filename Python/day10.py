n = int(raw_input().strip())
for i in range(n):
    num = int(raw_input().strip())
    blist = []
    while num > 0:
        blist.append(num % 2)
        num >>= 1
    print "".join(map(str, blist[-1::-1]))
