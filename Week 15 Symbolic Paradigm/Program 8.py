import sympy
x, y = sympy.symbols('x y')
func1 = x**2
func2 = sympy.sin(x)
func3 = sympy.cos(x)
integral1 = sympy.integrate(func1, (x, 0, y), (y, 0, 1))
integral2 = sympy.integrate(func2, (x, 0, y), (y, 0, 1))
integral3 = sympy.integrate(func3, (x, 0, y), (y, 0, 1))
print("Integral of x^2:", integral1)
print("Integral of sin(x):", integral2)
print("Integral of cos(x):", integral3)

