/*a java program for multithread in which user thread and thread started from main method invoked at a time each thread sleep for 1 sec.*/

class MyUserThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("User Thread started.");
            Thread.sleep(1000); // Sleep for 1 second
            System.out.println("User Thread finished.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyUserThread userThread = new MyUserThread();

        Thread mainThread = Thread.currentThread();

        // Start the user thread
        userThread.start();

        try {
            System.out.println("Main Thread started.");
            Thread.sleep(1000); // Sleep for 1 second
            System.out.println("Main Thread finished.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Wait for the user thread to complete
        try {
            userThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
