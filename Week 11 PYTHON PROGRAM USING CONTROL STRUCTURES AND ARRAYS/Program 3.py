#python program to count the Occurrences of a Specific Element in an Array.

# Get the user input for the array of numbers
input_str = input("Enter a list of numbers separated by spaces: ")
user_array = list(map(int, input_str.split()))

# Get the specific element to count
element_to_count = int(input("Enter the element you want to count: "))

# Initialize a counter to keep track of the occurrences
count = 0

# Iterate through the user_array and count occurrences
for num in user_array:
    if num == element_to_count:
        count += 1

# Print the result
print(f"The element {element_to_count} appears {count} times in the array.")
