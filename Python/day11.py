arr = []
for i in xrange(6):
    temp = map(int, raw_input().strip().split())
    arr.append(temp)

max_sum = -100
for i in xrange(4):
    for j in xrange(4):
        temp = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + \
               arr[i + 1][j + 1] + \
               arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2]
        if temp > max_sum: max_sum = temp
print max_sum
