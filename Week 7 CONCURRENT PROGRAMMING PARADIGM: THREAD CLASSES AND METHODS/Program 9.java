/*java program using sleep() method of Thread class where the new class thread created from the previous class is implemented by using sleep method for 10,20,50,70,100 ns*/


class SleepThread extends Thread {
    private long sleepDuration;

    public SleepThread(long sleepDuration) {
        this.sleepDuration = sleepDuration;
    }

    @Override
    public void run() {
        try {
            System.out.println("Thread with sleep duration " + sleepDuration + " milliseconds is starting.");
            Thread.sleep(sleepDuration);
            System.out.println("Thread with sleep duration " + sleepDuration + " milliseconds has finished.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        long[] sleepDurations = {10, 20, 50, 70, 100};

        for (long duration : sleepDurations) {
            Thread sleepThread = new SleepThread(duration);
            sleepThread.start();
        }
    }
}
