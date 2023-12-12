/*Create two objects threadobj1 and threadobj2 for the class UserThreadPriority. Set the name of threadobj1 as “ThreadA” and threadobj2 as “ThreadB”. Get a String and a Character from the user and assign into UserThreadPriority class variable k and c respectively. Call the start() method for the thread objects threadobj1 and threadobj2.*/


import java.util.Scanner;

class UserThreadPriority extends Thread {
    private String k;
    private char c;

    public UserThreadPriority(String name) {
        super(name);
    }

    public void setData(String k, char c) {
        this.k = k;
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(getName() + " is running with k = " + k + " and c = " + c);
        // Add your thread logic here
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create thread objects
        UserThreadPriority threadobj1 = new UserThreadPriority("ThreadA");
        UserThreadPriority threadobj2 = new UserThreadPriority("ThreadB");

        // Get user input for k and c
        System.out.print("Enter a string (k): ");
        String k = scanner.nextLine();

        System.out.print("Enter a character (c): ");
        char c = scanner.next().charAt(0);

        // Set data for threadobj1 and threadobj2
        threadobj1.setData(k, c);
        threadobj2.setData(k, c);

        // Start the threads
        threadobj1.start();
        threadobj2.start();

        // Close the scanner
        scanner.close();
    }
}
