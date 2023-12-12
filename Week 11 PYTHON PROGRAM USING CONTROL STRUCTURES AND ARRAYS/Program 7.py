#python program to print diamond number pattern using Nested Loops.


# Define the number of rows for the diamond (half of the total rows)
num_rows = 3

# Upper half of the diamond
for i in range(1, num_rows + 1):
    # Print spaces before the numbers
    for j in range(num_rows - i):
        print(" ", end="")
    
    # Print the numbers in ascending order
    for k in range(1, 2 * i):
        print(k, end="")
    
    # Move to the next line
    print()

# Lower half of the diamond
for i in range(num_rows - 1, 0, -1):
    # Print spaces before the numbers
    for j in range(num_rows - i):
        print(" ", end="")
    
    # Print the numbers in ascending order
    for k in range(1, 2 * i):
        print(k, end="")
    
    # Move to the next line
    print()
