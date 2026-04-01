package multithreading.Concept;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 3/31/2026
 */
public class AtomicDemo {
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger count = new AtomicInteger(0);
        Runnable runnable = () -> {
            for (int i = 0; i < 1000; i++) {
                count.incrementAndGet();
            }
        };
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("final count = " + count.get());
    }
}
