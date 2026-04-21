package multithreading.concept.reentrantlock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/10/2026
 */
public class TryLockTimeoutExample {
    private static final ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                if (lock.tryLock(1, TimeUnit.SECONDS)) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " acquired lock");
                        Thread.sleep(2000);
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + " timeout failed lock");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        new Thread(task, "t1").start();
        new Thread(task, "t2").start();
    }
}
