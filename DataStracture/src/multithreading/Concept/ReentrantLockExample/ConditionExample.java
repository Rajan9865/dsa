package multithreading.Concept.ReentrantLockExample;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/10/2026
 */
class Shared {
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();
    private boolean ready = false;

    public void waitForSignal() throws InterruptedException {
        lock.lock();
        try {
            while (!ready) {
                System.out.println("Waiting...");
                condition.await(); // wait
            }
            System.out.println("Received signal!");
        } finally {
            lock.unlock();
        }
    }

    public void sendSignal() {
        lock.lock();
        try {
            ready = true;
            condition.signal(); // notify
            System.out.println("Signal sent!");
        } finally {
            lock.unlock();
        }
    }
}

public class ConditionExample {
    public static void main(String[] args) {

        Shared shared = new Shared();

        new Thread(() -> {
            try {
                shared.waitForSignal();
            } catch (Exception e) {
            }
        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(2000);
                shared.sendSignal();
            } catch (Exception e) {
            }
        }).start();
    }
}