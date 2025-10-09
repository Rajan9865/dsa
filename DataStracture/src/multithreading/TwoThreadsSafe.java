package multithreading;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 10/9/2025
 */
public class TwoThreadsSafe {
    private static AtomicInteger count = new AtomicInteger();

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                count.incrementAndGet();
            }
            System.out.println("thread 1 is finished");
        });
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                count.incrementAndGet();
            }
            System.out.println(" thread 2 is finished");
        });
        thread.start();
        thread1.start();
        try {
            thread.join();
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("final count of 1000 " + count);
    }
}
