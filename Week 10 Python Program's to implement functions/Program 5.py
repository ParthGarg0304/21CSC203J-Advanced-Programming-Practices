#python program to Check if a Number is Even or Odd and also check whether it is Prime or not.

def is_even(num):
    return num % 2 == 0

def is_prime(num):
    if num <= 1:
        return False
    elif num <= 3:
        return True
    elif num % 2 == 0 or num % 3 == 0:
        return False
    i = 5
    while i * i <= num:
        if num % i == 0 or num % (i + 2) == 0:
            return False
        i += 6
    return True

def main():
    try:
        num = int(input("Enter a number:"))
        if is_even(num):
            print(f"{num} is even.")
        else:
            print(f"{num} is odd.")

        if is_prime(num):
            print(f"{num} is prime.")
        else:
            print(f"{num} is not prime.")
    except ValueError:
        print("Invalid input")

main()
