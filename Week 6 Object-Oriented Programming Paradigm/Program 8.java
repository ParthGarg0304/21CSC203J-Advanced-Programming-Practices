/*Java program to create an interface Flyable with a method called fly_obj(). Create three classes Spacecraft, Airplane, and Helicopter that implement the Flyable interface. Implement the fly_obj() method for each of the three classes. Hint :- fly_obj definition – prints the particular object is flying.*/


import java.util.Scanner;

interface Flyable {
    void fly_obj();
}

class Spacecraft implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Spacecraft is flying");
    }
}

class Airplane implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Airplane is flying");
    }
}

class Helicopter implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Helicopter is flying");
    }
}

class Main {
    public static void main(String[] args) {
        Flyable spacecraft = new Spacecraft();
        Flyable airplane = new Airplane();
        Flyable helicopter = new Helicopter();

        System.out.println("Flying Objects:");
        System.out.print("1. ");
        spacecraft.fly_obj();

        System.out.print("2. ");
        airplane.fly_obj();

        System.out.print("3. ");
        helicopter.fly_obj();
    }
}
