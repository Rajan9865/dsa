package multithreading.concept.producerconsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/14/2026
 */
public class BlockingQueueExample {
    public static void main(String[] args) {
//        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5, true);
        Runnable producer = () -> {
            int value = 0;
            try {
                while (true) {
                    queue.put(value);
                    System.out.println("produced : " + value);
                    value++;
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Runnable consumer = () -> {
            try {
                while (true) {
                    int value = queue.take();
                    System.out.println("consumed : " + value);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
