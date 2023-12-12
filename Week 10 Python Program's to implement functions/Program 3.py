#python program to calculate the Factorial of a given number. 

def factorial(n):
    if n == 0:
        return 1
    else:
        return n * factorial(n - 1)

def main():
    num = int(input("Enter a number:"))
    result = factorial(num)
    print(f"The factorial of {num} is {result}")
    
main()
