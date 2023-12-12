/*java program to solve printer synchronization problem in which all the jobs must be completed in order.*/


class Printer {
    private int currentJobNumber = 1;

    public synchronized void print(int jobNumber) {
        while (jobNumber != currentJobNumber) {
            try {
                wait(); // Wait for the correct job to arrive
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("Printing job: " + jobNumber);

        currentJobNumber++;

        notifyAll(); // Notify all waiting threads that a job has been printed
    }
}

class Job implements Runnable {
    private int jobNumber;
    private Printer printer;

    public Job(int jobNumber, Printer printer) {
        this.jobNumber = jobNumber;
        this.printer = printer;
    }

    @Override
    public void run() {
        printer.print(jobNumber);
    }
}

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();

        for (int i = 1; i <= 5; i++) {
            Thread jobThread = new Thread(new Job(i, printer));
            jobThread.start();
        }
    }
} 
