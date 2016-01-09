n = int(raw_input().strip())
arr = map(int,raw_input().strip().split(' '))
for i in range(1, n + 1):
    print arr[-i],
print
