#python program to calculate the sum of Two numbers and Three numbers. However, if the sum is between 120 to 320 it will return 200.

def calculate_sum(numbers):
    total = sum(numbers)
    if 120 <= total <= 320:
        return 200
    else:
        return total

def main():
    num_count = int(input("Enter the number of values (2 or 3):"))
    
    if num_count == 2:
        num1 = float(input("Enter the first number:"))
        num2 = float(input("Enter the second number:"))
        result = calculate_sum([num1, num2])
    elif num_count == 3:
        num1 = float(input("Enter the first number:"))
        num2 = float(input("Enter the second number:"))
        num3 = float(input("Enter the third number:"))
        result = calculate_sum([num1, num2, num3])
    else:
        print("Invalid number count")

    print(f"Result:{result}")
    
main()
