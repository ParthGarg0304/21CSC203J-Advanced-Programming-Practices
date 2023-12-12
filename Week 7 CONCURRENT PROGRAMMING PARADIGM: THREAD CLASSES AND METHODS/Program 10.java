/*java Thread program using Thread Priority for 5 processes and execute the priority order among the process.*/

class Process extends Thread {
    private int processNumber;

    public Process(int processNumber, String name, int priority) {
        this.processNumber = processNumber;
        this.setName(name);
        this.setPriority(priority);
    }

    @Override
    public void run() {
        System.out.println("Process " + processNumber + " started with priority " + getPriority());
        for (int i = 1; i <= 5; i++) {
            System.out.println("Process " + processNumber + " is running step " + i);
        }
        System.out.println("Process " + processNumber + " finished.");
    }
}

class Main {
    public static void main(String[] args) {
        Process process1 = new Process(1, "Process 1", Thread.MIN_PRIORITY);
        Process process2 = new Process(2, "Process 2", Thread.NORM_PRIORITY);
        Process process3 = new Process(3, "Process 3", Thread.NORM_PRIORITY);
        Process process4 = new Process(4, "Process 4", Thread.MAX_PRIORITY);
        Process process5 = new Process(5, "Process 5", Thread.MAX_PRIORITY);

        process1.start();
        process2.start();
        process3.start();
        process4.start();
        process5.start();
    }
}
