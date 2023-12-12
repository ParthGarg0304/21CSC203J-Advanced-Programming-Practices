python program to perform Arithmetic operations on Complex Numbers.
def main():
   
    # Get the first complex number from the user
    real1 = float(input("Enter the real part of the first complex number: "))
    imag1 = float(input("Enter the imaginary part of the first complex number: "))
    complex1 = complex(real1, imag1)

    # Get the second complex number from the user
    real2 = float(input("Enter the real part of the second complex number: "))
    imag2 = float(input("Enter the imaginary part of the second complex number: "))
    complex2 = complex(real2, imag2)

    # Perform arithmetic operations
    addition_result = complex1 + complex2
    subtraction_result = complex1 - complex2
    multiplication_result = complex1 * complex2

    # Division is a bit more involved
    try:
        division_result = complex1 / complex2
    except ZeroDivisionError:
        division_result = "Division by zero is not allowed."

    # Display the results
    print(f"Complex Number 1: {complex1}")
    print(f"Complex Number 2: {complex2}")
    print(f"Addition Result: {addition_result}")
    print(f"Subtraction Result: {subtraction_result}")
    print(f"Multiplication Result: {multiplication_result}")
    print(f"Division Result: {division_result}")

main()
