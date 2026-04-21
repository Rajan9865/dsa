package multithreading.concept.producerconsumer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/14/2026
 */
public class WithoutSynchronization {
    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) {
        Thread procucer = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                queue.add(i);
                System.out.println("produced: " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread consumer = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                Integer poll = queue.poll();
                System.out.println("consumed: " + poll);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
            }
        });
        procucer.start();
        consumer.start();
    }
}
