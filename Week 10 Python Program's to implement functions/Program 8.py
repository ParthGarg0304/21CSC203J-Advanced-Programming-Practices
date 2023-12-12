#python function to Convert Celsius to Fahrenheit and Fahrenheit to Celsius.


def celsius_to_fahrenheit(celsius):
    fahrenheit = (celsius * 9/5) + 32
    return fahrenheit

def fahrenheit_to_celsius(fahrenheit):
    celsius = (fahrenheit - 32) * 5/9
    return celsius

def main():
    while True:
        print("Choose an option:")
        print("1. Convert Celsius to Fahrenheit")
        print("2. Convert Fahrenheit to Celsius")
        print("3. Quit")
        choice = input("Enter your choice (1/2/3):")

        if choice == '1':
            celsius = float(input("Enter temperature in Celsius:"))
            fahrenheit = celsius_to_fahrenheit(celsius)
            print(f"{celsius}°C is equal to {fahrenheit}°F\n")
        elif choice == '2':
            fahrenheit = float(input("Enter temperature in Fahrenheit:"))
            celsius = fahrenheit_to_celsius(fahrenheit)
            print(f"{fahrenheit}°F is equal to {celsius}°C\n")
        elif choice == '3':
            break
        else:
            print("Invalid choice. Please select a valid option.")

main()
