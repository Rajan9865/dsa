package multithreading.concept.semaphore;

import java.util.concurrent.Semaphore;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/15/2026
 */
public class LimitedAccessExample {
    private static final Semaphore semaphore = new Semaphore(2);

    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                System.out.println(Thread.currentThread().getName() + " waiting..");
                semaphore.acquire();
                System.out.println(Thread.currentThread().getName() + " working..");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                semaphore.release();
                System.out.println(Thread.currentThread().getName() + " released. done");
            }
        };
        for (int i = 0; i < 10; i++) {
            new Thread(task).start();
        }
    }
}
