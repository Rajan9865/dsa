package multithreading.Concept.ReentrantLockExample;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/9/2026
 */
class Counter {
    private int count = 0;
    private final ReentrantLock lock = new ReentrantLock();

    public void inc() {
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }
    }

    public int getCount() {
        return count;
    }
}

public class BasicLockExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.inc();
            }
        };
        Thread t1 = new Thread(task, "t1");
        Thread t2 = new Thread(task, "t2");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("final counter " + counter.getCount());
    }
}
