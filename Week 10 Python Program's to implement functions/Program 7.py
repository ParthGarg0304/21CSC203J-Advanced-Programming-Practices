#python program to calculate the area and perimeter of different geometric shapes (circle, rectangle, triangle, etc.).

import math

def calculate_circle_area(radius):
    return math.pi * radius*radius

def calculate_circle_perimeter(radius):
    return 2 * math.pi * radius

def calculate_rectangle_area(length, width):
    return length * width

def calculate_rectangle_perimeter(length, width):
    return 2 * (length + width)

def calculate_triangle_area(base, height):
    return 0.5 * base * height

def calculate_triangle_perimeter(side1, side2, side3):
    return side1 + side2 + side3

def main():
   
    print("Choose a shape to calculate its area and perimeter:")
    print("1. Circle")
    print("2. Rectangle")
    print("3. Triangle")
    
    choice = int(input("Enter your choice (1/2/3):"))
    
    if choice == 1:
        radius = float(input("Enter the radius of the circle:"))
        area = calculate_circle_area(radius)
        perimeter = calculate_circle_perimeter(radius)
    elif choice == 2:
        length = float(input("Enter the length of the rectangle:"))
        width = float(input("Enter the width of the rectangle:"))
        area = calculate_rectangle_area(length, width)
        perimeter = calculate_rectangle_perimeter(length, width)
    elif choice == 3:
        base = float(input("Enter the base of the triangle:"))
        height = float(input("Enter the height of the triangle:"))
        area = calculate_triangle_area(base, height)
        
        side1 = float(input("Enter the length of side 1:"))
        side2 = float(input("Enter the length of side 2:"))
        side3 = float(input("Enter the length of side 3:"))
        perimeter = calculate_triangle_perimeter(side1, side2, side3)
    else:
        print("Invalid choice")
        return
    
    print(f"Area:{area}")
    print(f"Perimeter:{perimeter}")

main()
