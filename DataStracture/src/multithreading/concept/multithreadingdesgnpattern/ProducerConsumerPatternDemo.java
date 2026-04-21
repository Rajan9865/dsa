package multithreading.concept.multithreadingdesgnpattern;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/21/2026
 */
public class ProducerConsumerPatternDemo {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
        Runnable producer = () -> {
            int i = 0;
            try {
                while (true) {
                    queue.put(i);
                    System.out.println("producer " + Thread.currentThread().getName() + " put " + i);
                    i++;

                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Runnable consumer = () -> {
            try {
                while (true) {
                    System.out.println("consumed " + Thread.currentThread().getName() + queue.take());
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
