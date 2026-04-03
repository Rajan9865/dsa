package multithreading.Concept;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Rajan  kumar
 * @version 1.0
 * Dsa
 * @since 3/30/2026
 */
public class AtomicExample {
    private static AtomicInteger count = new AtomicInteger(0);
//    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                count.incrementAndGet();
            }
        };
        Thread thread = new Thread(task);
        Thread thread2 = new Thread(task);
        thread.start();
        thread2.start();
        thread.join();
        thread2.join();
        System.out.println(count.get());
        System.out.println("final count = " + count);
    }
}
