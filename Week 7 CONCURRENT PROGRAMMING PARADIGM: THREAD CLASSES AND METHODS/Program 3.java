/*a java program in which thread sleep for 5 sec and change the name of thread.*/


class MyThread extends Thread {
    public MyThread(String name) {
        super(name); // Set the thread's name using the constructor
    }

    @Override
    public void run() {
        try {
            System.out.println("Thread " + getName() + " is sleeping for 5 seconds.");
            Thread.sleep(5000); // Sleep for 5 seconds
            System.out.println("Thread " + getName() + " woke up after 5 seconds.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Main {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");

        thread1.start();
        thread2.start();
    }
}
