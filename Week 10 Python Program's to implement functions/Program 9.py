#Python program that accepts a string and counts the number of upper and lower case letters.

def count_upper_lower_case_letters(input_string):
    upper_count = 0
    lower_count = 0

    for char in input_string:
        if char.isupper():
            upper_count += 1
        elif char.islower():
            lower_count += 1

    return upper_count, lower_count

def main():
    input_string = input("Enter a string:")
    upper_count, lower_count = count_upper_lower_case_letters(input_string)

    print(f"Number of uppercase letters:{upper_count}")
    print(f"Number of lowercase letters:{lower_count}")

main()
