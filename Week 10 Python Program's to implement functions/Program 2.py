#Implement a python function to find the Maximum of Three numbers.


def find_maximum_of_three_numbers(num1, num2, num3):
    return max(num1, num2, num3)

def main():
    try:
        num1 = float(input("Enter the first number:"))
        num2 = float(input("Enter the second number:"))
        num3 = float(input("Enter the third number:"))
    except ValueError:
        print("Invalid input")
        return

    maximum = find_maximum_of_three_numbers(num1, num2, num3)
    print(f"MAX: {maximum}")

main()
