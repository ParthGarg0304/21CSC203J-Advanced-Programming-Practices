/*program to perform arithmetic operations using method overloading.*/

import java.util.Scanner;

class ArithmeticOperations {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Method to subtract two integers
    public int subtract(int a, int b) {
        return a - b;
    }

    // Method to subtract two doubles
    public double subtract(double a, double b) {
        return a - b;
    }

    // Method to multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to multiply two doubles
    public double multiply(double a, double b) {
        return a * b;
    }

    // Method to divide two integers
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    // Method to divide two doubles
    public double divide(double a, double b) {
        if (b == 0.0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}

class Main {
    public static void main(String[] args) {
        ArithmeticOperations operations = new ArithmeticOperations();

        // Integer arithmetic
        int sumInt = operations.add(10, 5);
        int diffInt = operations.subtract(15, 7);
        int prodInt = operations.multiply(3, 4);
        int divInt = operations.divide(20, 4);

        System.out.println("Integer operations:");
        System.out.println("Sum: " + sumInt);
        System.out.println("Difference: " + diffInt);
        System.out.println("Product: " + prodInt);
        System.out.println("Division: " + divInt);

        // Double arithmetic
        double sumDouble = operations.add(10.5, 5.2);
        double diffDouble = operations.subtract(15.7, 7.3);
        double prodDouble = operations.multiply(3.0, 4.5);
        double divDouble = operations.divide(20.0, 4.0);

        System.out.println("\nDouble operations:");
        System.out.println("Sum: " + sumDouble);
        System.out.println("Difference: " + diffDouble);
        System.out.println("Product: " + prodDouble);
        System.out.println("Division: " + divDouble);
    }
}
