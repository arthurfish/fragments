from math import *
def f(x1, x2):
    if x1 == 0:
        return '0'
    else:
        if x1 >= 2 ** x2:
            return '1' + f(x1-2**x2, x2-1)
        else:
            return '0' + f(x1, x2-1)

print(f(10, 8))