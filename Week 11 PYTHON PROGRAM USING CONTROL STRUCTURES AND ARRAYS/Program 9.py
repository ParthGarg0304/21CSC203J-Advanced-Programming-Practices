#Python program that checks the strength of a password entered by a user. The program should assess the password based on criteria like length, use of uppercase and lowercase letters, digits, and special characters. Use control structures and arrays to provide a detailed evaluation.
def check_password_strength(password):
    # Initialize criteria
    length_criteria = len(password) >= 8
    uppercase_criteria = any(char.isupper() for char in password)
    lowercase_criteria = any(char.islower() for char in password)
    digit_criteria = any(char.isdigit() for char in password)
    special_char_criteria = any(char in "!@#$%^&*()_+-={}[]|\:;'<>?,./" for char in password)

    # Create an array to store evaluation messages
    evaluation = []

    # Check each criteria and add corresponding messages to the array
    if length_criteria:
        evaluation.append("Password is at least 8 characters long.")
    else:
        evaluation.append(" Password should be at least 8 characters long.")

    if uppercase_criteria:
        evaluation.append(" Password contains uppercase letters.")
    else:
        evaluation.append(" Password should contain at least one uppercase letter.")

    if lowercase_criteria:
        evaluation.append(" Password contains lowercase letters.")
    else:
        evaluation.append(" Password should contain at least one lowercase letter.")

    if digit_criteria:
        evaluation.append(" Password contains digits.")
    else:
        evaluation.append("Password should contain at least one digit.")

    if special_char_criteria:
        evaluation.append(" Password contains special characters.")
    else:
        evaluation.append(" Password should contain at least one special character (!@#$%^&*()_+-={}[]|:;'<>?,./)")

    # Calculate the overall strength
    strength = sum([length_criteria, uppercase_criteria, lowercase_criteria, digit_criteria, special_char_criteria])

    return evaluation, strength

# Get the password from the user
password = input("Enter your password: ")

evaluation, strength = check_password_strength(password)

print("\nPassword Strength Evaluation:")
for message in evaluation:
    print(message)

if strength >= 4:
    print("Strong Password! Your password meets all criteria.")
elif strength >= 3:
    print(" Good Password! Your password is moderately strong.")
else:
    print(" Weak Password! Please improve your password.")
