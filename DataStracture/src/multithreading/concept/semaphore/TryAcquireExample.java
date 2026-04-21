package multithreading.concept.semaphore;

import java.util.concurrent.Semaphore;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/16/2026
 */
public class TryAcquireExample {
    private static final Semaphore semaphore = new Semaphore(2);

    public static void main(String[] args) {
        Runnable task = () -> {
            if (semaphore.tryAcquire()) {
                try {
                    System.out.println(Thread.currentThread().getName() + " working..");
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    semaphore.release();
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " failed. skip...");
            }
        };
        for (int i = 0; i < 10; i++) {
            new Thread(task).start();
        }
    }
}
