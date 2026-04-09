package multithreading.Concept.deadLockPrevent;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/8/2026
 */
public class PreventDeadlockUsingTimeout {
    private static final ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                if (lock.tryLock(1, TimeUnit.SECONDS)) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " got lock");
                        Thread.sleep(500);
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + " skipped timeout");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        new Thread(task, "t1").start();
        new Thread(task, "t2").start();
    }
}
