/*java program for to solve producer consumer problem in which a producer produce a value and consumer consume the value before producer generate the next value.*/


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Producer extends Thread {
    private final BlockingQueue<Integer> queue;

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) { // Produce 5 values
                int value = i;
                System.out.println("Producer produced: " + value);
                queue.put(value); // Put the value into the queue
                Thread.sleep(1000); // Simulate some work before producing the next value
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer extends Thread {
    private final BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) { // Consume 5 values
                int value = queue.take(); // Take a value from the queue
                System.out.println("Consumer consumed: " + value);
                Thread.sleep(1500); // Simulate some work before consuming the next value
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5); // Create a blocking queue with a capacity of 5

        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        producer.start();
        consumer.start();
    }
}
