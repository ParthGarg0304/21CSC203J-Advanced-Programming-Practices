#Python program that simulates a simple guessing game. Generate a random number and have the user guess it. Provide hints like "too high" or "too low" until they guess correctly.

import random

# Generate a random number between 1 and 100
secret_number = random.randint(1, 100)

print("Welcome to the Guessing Game!")
print("I'm thinking of a number between 1 and 100.")

attempts = 0

while True:
    try:
        user_guess = int(input("Guess the number: "))
        attempts += 1

        if user_guess < secret_number:
            print("Too low. Try again.")
        elif user_guess > secret_number:
            print("Too high. Try again.")
        else:
            print(f"Congratulations! You've guessed the correct number, which is {secret_number}. It took you {attempts} attempts.")
            break
    except ValueError:
        print("Please enter a valid number.")

