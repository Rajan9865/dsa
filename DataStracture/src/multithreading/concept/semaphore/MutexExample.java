package multithreading.concept.semaphore;

import java.util.concurrent.Semaphore;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/15/2026
 */
public class MutexExample {
    private static final Semaphore mutex = new Semaphore(1);
    private static int count = 0;

    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            try {
                mutex.acquire();
                count++;
                System.out.println(Thread.currentThread().getName() + " -> " + count);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                mutex.release();
            }
        };
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}
