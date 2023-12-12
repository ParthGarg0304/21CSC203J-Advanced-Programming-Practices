import sympy
x = sympy.symbols('x')
expression = sympy.sin(x) / sympy.cos(x)

simplified_expression = sympy.simplify(expression)
print(simplified_expression)
