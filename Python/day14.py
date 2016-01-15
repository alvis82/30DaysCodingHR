class Difference:
    def __init__(self, a):
        self.__elements = a

    def computeDifference(self):
        min_value, max_value = 100, 0
        for elem in self.__elements:
            if elem < min_value: min_value = elem
            if elem > max_value: max_value = elem
        self.maximumDifference = max_value - min_value

_ = raw_input()
a = [int(e) for e in raw_input().split(' ')]
d = Difference(a)
d.computeDifference()
print d.maximumDifference
