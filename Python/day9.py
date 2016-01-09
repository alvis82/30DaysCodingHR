def find_gcd(a,b):
    if b == 0:
        return a

    if a < b:
        a, b = b, a

    return find_gcd(b, a % b)

a, b = map(int, raw_input().strip().split())
print find_gcd(a, b)
