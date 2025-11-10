package multithreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 10/9/2025
 */
public class VolatileCounter2withAtomic {

    private static AtomicInteger count = new AtomicInteger(0);

    public static void main(String[] args) {
        int numberOfThreads = 10;
        Thread[] threads = new Thread[numberOfThreads];
        for (int i = 0; i < numberOfThreads; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    count.incrementAndGet();
                }
            });
            threads[i].start();
        }
        for (int i = 0; i < numberOfThreads; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        ReentrantLock reentrantLock = new ReentrantLock();
        Lock lock = new Lock() {
            @Override
            public void lock() {

            }

            @Override
            public void lockInterruptibly() throws InterruptedException {

            }

            @Override
            public boolean tryLock() {
                return false;
            }

            @Override
            public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
                return false;
            }

            @Override
            public void unlock() {

            }

            @Override
            public Condition newCondition() {
                return null;
            }
        };
        System.out.println("final count 1000  = " + count);
    }
}
