import numpy as np
A = np.array([[3, 7, -12],[4, -2, -5]])
b = np.array([0, 0])
solution = np.linalg.solve(A, b)
print(solution)
