package multithreading.concept.semaphore;

import java.util.concurrent.Semaphore;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/16/2026
 */
public class RateLimiterExample {
    private static Semaphore semaphore = new Semaphore(1);

    public static void main(String[] args) {
        Runnable request = () -> {
            try {
                semaphore.acquire();
                System.out.println(Thread.currentThread().getName() + " processing request ");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
//                semaphore.release(1);
            }
        };
        for (int i = 1; i <= 10; i++) {
            new Thread(request).start();
        }
    }
}
