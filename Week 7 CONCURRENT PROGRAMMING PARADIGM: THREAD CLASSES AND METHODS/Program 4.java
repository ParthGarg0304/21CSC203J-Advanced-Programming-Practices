/*java program in which thread sleep for 6 sec in the loop in reverse order from 5 to 1 and change the name of thread.*/


class MyThread extends Thread {
    public MyThread(String name) {
        super(name); // Set the thread's name using the constructor
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i >= 1; i--) {
                System.out.println("Thread " + getName() + " is sleeping for " + i + " seconds.");
                Thread.sleep(1000); // Sleep for 1 second
            }
            System.out.println("Thread " + getName() + " has finished.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Main {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");
        MyThread thread3 = new MyThread("Thread 3");
        MyThread thread4 = new MyThread("Thread 4");
        MyThread thread5 = new MyThread("Thread 5");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
