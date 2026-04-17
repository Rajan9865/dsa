package multithreading.concept;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 3/30/2026
 */
public class LockExample {
    private final ReentrantLock lock = new ReentrantLock();
    private int count = 0;

    private void increment() {
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        LockExample obj = new LockExample();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                obj.increment();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                obj.increment();
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final Count: " + obj.count);
    }
}
