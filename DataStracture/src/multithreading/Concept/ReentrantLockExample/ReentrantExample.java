package multithreading.Concept.ReentrantLockExample;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/9/2026
 */
class ReentrantDemo {
    private final ReentrantLock lock = new ReentrantLock();

    public void outer() {
        lock.lock();
        try {
            System.out.println("outer methods");
            inner();
        } finally {
            lock.unlock();
        }
    }

    private void inner() {
        lock.lock();
        try {
            System.out.println("inner methods");
        } finally {
            lock.unlock();
        }
    }
}

public class ReentrantExample {
    public static void main(String[] args) {
        ReentrantDemo demo = new ReentrantDemo();
        demo.outer();
    }
}
