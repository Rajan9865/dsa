package multithreading.concept.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/10/2026
 */
public class TryLockExample {
    private static final ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {
        Runnable task = () ->
        {
            if (lock.tryLock()) {
                try {
                    System.out.println(Thread.currentThread().getName() + " got lock");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println(Thread.currentThread().getName() + "could not acquire lock");
            }
        };
        new Thread(task, "t1").start();
        new Thread(task, "t2").start();
    }
}
