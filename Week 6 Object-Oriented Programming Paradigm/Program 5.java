/*program to create a class called Shape with methods called getPerimeter() and getArea(). Create a subclass called Circle that overrides the getPerimeter() and getArea() methods to calculate the area and perimeter of a circle.*/


import java.util.Scanner;

class Shape {
    public double getPerimeter() {
        return 0.0; // Default implementation
    }

    public double getArea() {
        return 0.0; // Default implementation
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);

        System.out.println("Circle Radius: " + circle.getPerimeter());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());
        System.out.println("Circle Area: " + circle.getArea());
    }
}
