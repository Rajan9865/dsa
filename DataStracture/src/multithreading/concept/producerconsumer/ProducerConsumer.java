package multithreading.concept.producerconsumer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/14/2026
 */
public class ProducerConsumer {
    private final Queue<Integer> queue = new LinkedList<>();
    private final int capacity = 5;

    public static void main(String[] args) {
        ProducerConsumer producerConsumer = new ProducerConsumer();
        new Thread(() ->
        {
            try {
                producerConsumer.produce();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }).start();
        new Thread(() ->
        {
            try {
                producerConsumer.consume();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        ).start();
    }

    private void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {
                while (queue.isEmpty()) {
                    wait();
                }
                int value = queue.poll();
                System.out.println("consume value: " + value);
                notify();
            }
            Thread.sleep(500);
        }
    }

    private void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (this) {
                while (queue.size() == capacity) {
                    wait();
                }
                queue.add(value);
                System.out.println("printed " + value);
                value++;
                notify();
            }
            Thread.sleep(500);
        }
    }
}
