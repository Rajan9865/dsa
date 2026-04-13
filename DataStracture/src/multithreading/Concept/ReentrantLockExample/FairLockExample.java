package multithreading.Concept.ReentrantLockExample;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/10/2026
 */
public class FairLockExample {
    private static final ReentrantLock lock = new ReentrantLock(true);

    public static void main(String[] args) {
        Runnable task = () ->
        {
            lock.lock();
            try {
                System.out.println(Thread.currentThread().getName() + " got lock");
                try {
                    Thread.sleep(520);
                } catch (InterruptedException e) {
                }
            } finally {
                lock.unlock();
            }
        };
        for (int i = 0; i < 10; i++) {
            new Thread(task).start();
        }
    }
}
