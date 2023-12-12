#Python program that performs matrix multiplication. Ask the user to input two matrices as lists of lists (2D arrays) and then multiply them if possible. Make sure to check if the matrices are compatible for multiplication and handle errors gracefully.


def matrix_multiplication(matrix1, matrix2):
    if len(matrix1[0]) != len(matrix2):
        raise ValueError("Matrix dimensions are incompatible for multiplication.")

    result = [[0 for _ in range(len(matrix2[0]))] for _ in range(len(matrix1))]

    for i in range(len(matrix1)):
        for j in range(len(matrix2[0]):
            for k in range(len(matrix2)):
                result[i][j] += matrix1[i][k] * matrix2[k][j]

    return result

def input_matrix(prompt):
    try:
        rows = int(input(f"Enter the number of rows for {prompt} matrix: "))
        cols = int(input(f"Enter the number of columns for {prompt} matrix: "))

        matrix = []
        print(f"Enter the elements for {prompt} matrix:")
        for i in range(rows):
            row = []
            for j in range(cols):
                element = float(input(f"Enter element at row {i+1}, column {j+1}: "))
                row.append(element)
            matrix.append(row)

        return matrix
    except ValueError:
        print("Invalid input. Please enter valid numeric values.")
        return input_matrix(prompt)

# Get user input for the two matrices
try:
    matrix1 = input_matrix("first")
    matrix2 = input_matrix("second")

    result = matrix_multiplication(matrix1, matrix2)

    print("\nMatrix 1:")
    for row in matrix1:
        print(row)

    print("\nMatrix 2:")
    for row in matrix2:
        print(row)

    print("\nMatrix Multiplication Result:")
    for row in result:
        print(row)
except ValueError as e:
    print("Error:", e)
