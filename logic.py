from sympy.logic import SOPform
from sympy import simplify_logic, symbols
P, Q, R = symbols('P Q R')
terms = [
    [1, 1, 0],
    [1, 0, 0],
    [0, 1, 0],
]
ans = SOPform([P, Q, R], terms)
print(simplify_logic(ans))

P, Q, R = symbols('P Q R')
terms = [
    [1, 1, 0],
    [0, 1, 1],
    [0, 1, 0],
]
ans = SOPform([P, Q, R], terms)
print(simplify_logic(ans))
