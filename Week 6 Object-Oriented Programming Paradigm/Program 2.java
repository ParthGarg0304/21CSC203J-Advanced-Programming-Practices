/*program to create class called "TrafficLight" with attributes for color and duration, and methods to change the color and check for red or green.*/


import java.util.Scanner;

class TrafficLight {
    private String color;
    private int duration; // in seconds

    // Constructor
    public TrafficLight(String initialColor, int initialDuration) {
        color = initialColor;
        duration = initialDuration;
    }

    // Method to change the color of the traffic light
    public void changeColor(String newColor) {
        color = newColor;
    }

    // Method to check if the traffic light is red
    public boolean isRed() {
        return color.equals("red");
    }

    // Method to check if the traffic light is green
    public boolean isGreen() {
        return color.equals("green");
    }

    // Getter method for duration
    public int getDuration() {
        return duration;
    }
}

class Main {
    public static void main(String[] args) {
        // Create a TrafficLight instance
        TrafficLight trafficLight = new TrafficLight("red", 30);

        // Check the initial state of the traffic light
        System.out.println("Initial Color: " + trafficLight.isRed()); // Should be true
        System.out.println("Initial Duration: " + trafficLight.getDuration() + " seconds");

        // Change the color of the traffic light
        trafficLight.changeColor("green");

        // Check the new state of the traffic light
        System.out.println("New Color: " + trafficLight.isGreen()); // Should be true
    }
}
