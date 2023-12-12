#Implement a python function to Reverse a given String and also check for palindrome or not.


def is_palindrome(s):
    s = s.replace(" ", "").lower()
    
    # Check if the string is equal to its reverse
    return s == s[::-1]

def reverse_string_and_check_palindrome():
    # Input from the user
    input_string = input("Enter a string:")
    
    # Reverse the string
    reversed_string = input_string[::-1]
    
    # Check if it's a palindrome
    if is_palindrome(input_string):
        print(f"'{input_string}' is a palindrome.")
    else:
        print(f"'{input_string}' is not a palindrome.")
    
    # Print the reversed string
    print(f"Reversed string:{reversed_string}")

# Call the function
reverse_string_and_check_palindrome()
