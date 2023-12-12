import sympy
x = sympy.symbols('x')
log_x = sympy.log(x)
inv_x = 1/x
sin_x = sympy.sin(x)
cos_x = sympy.cos(x)
derivative_log_x = sympy.diff(log_x, x)
derivative_inv_x = sympy.diff(inv_x, x)
derivative_sin_x = sympy.diff(sin_x, x)
derivative_cos_x = sympy.diff(cos_x, x)
print("Derivative of log(x):", derivative_log_x)
print("Derivative of 1/x:", derivative_inv_x)
print("Derivative of sin(x):", derivative_sin_x)
print("Derivative of cos(x):", derivative_cos_x)
