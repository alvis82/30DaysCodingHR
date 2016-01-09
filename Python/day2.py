m = float(raw_input())
t = float(raw_input())
x = float(raw_input())
print "The final price of the meal is ${}.".format(
    int(round(m * (1 + (t + x) / 100))))
