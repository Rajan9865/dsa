package multithreading.Concept;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 3/31/2026
 */
public class ProducerConsumer {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(4);
        new Thread(() -> {
            try {
                queue.put(1);
                queue.put(2);
                queue.put(3);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
        new Thread(() -> {
            while (true) {
                try {
                    System.out.println("consumed " + queue.take());
                } catch (InterruptedException e) {
                }
            }
        }).start();
    }
}
