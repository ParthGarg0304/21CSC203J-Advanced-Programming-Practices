#Python program that generates the Fibonacci sequence up to a specified number of terms using a loop and stores it in an array.


def generate_fibonacci_sequence(num_terms):
    fibonacci_sequence = []
    
    if num_terms <= 0:
        return []

    a, b = 0, 1
    count = 0

    while count < num_terms:
        fibonacci_sequence.append(a)
        a, b = b, a + b
        count += 1

    return fibonacci_sequence

# Get the number of terms from the user
num_terms = int(input("Enter the number of terms in the Fibonacci sequence: "))

if num_terms <= 0:
    print("Please enter a positive integer.")
else:
    fibonacci_sequence = generate_fibonacci_sequence(num_terms)
    print("Fibonacci sequence up to", num_terms, "terms:")
    print(fibonacci_sequence)
