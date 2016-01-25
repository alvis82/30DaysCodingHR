import math

def is_prime(n):
    if n == 1:
        return False

    sqrt_n = int(math.sqrt(n))
    for i in range(2, sqrt_n + 1):
        if n % i == 0:
            return False

    return True

n_of_testcase = int(raw_input())
for i in range(n_of_testcase):
    n = int(raw_input())
    if is_prime(n):
        print "Prime"
    else:
        print "Not prime"
