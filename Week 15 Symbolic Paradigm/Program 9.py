import sympy
x = sympy.symbols('x')
f = sympy.Function('f')(x)
diff_eq = sympy.Eq(f.diff(x, x) + 9*f, 1)
solution = sympy.dsolve(diff_eq)
print(solution)
