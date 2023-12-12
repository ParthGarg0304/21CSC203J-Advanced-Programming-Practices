import sympy
x, y = sympy.symbols('x y')
equation1 = sympy.Eq(x + y, 2)
equation2 = sympy.Eq(2*x + y, 0)
solution = sympy.solve((equation1, equation2), (x, y))
print(solution)
