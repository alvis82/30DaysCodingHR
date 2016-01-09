t = int(raw_input())
for i in range(t):
    a, b, n = map(int, raw_input().split())
    p = 1;
    r = [a + b * p]
    for j in range(1, n):
        p *= 2
        r.append(r[-1] + b * p)
    print " ".join(map(str, r))
