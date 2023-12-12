import sympy
x = sympy.symbols('x')
expression = (sympy.sin(x) - x) / x**3
limit_result = sympy.limit(expression, x, 0)
print(limit_result)
