package multithreading.concept.realworld;

import java.util.concurrent.Semaphore;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/23/2026
 */
public class RateLimiterDemo {
    private static final Semaphore semaphore = new Semaphore(2);

    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                semaphore.acquire();
                System.out.println(Thread.currentThread().getName() + "processing..");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                semaphore.release();
            }
        };
        for (int i = 0; i < 10; i++) {
            new Thread(task).start();
        }
    }
}
