package multithreading.Concept.deadLockPrevent;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/8/2026
 */
public class DeadlockPreventUsingTryLock {
    private static final ReentrantLock lock1 = new ReentrantLock();
    private static final ReentrantLock lock2 = new ReentrantLock();

    public static void main(String[] args) {
        Runnable task = () -> {
            while (true) {
                boolean got1 = lock1.tryLock();
                boolean got2 = lock2.tryLock();
                try {
                    if (got1 && got2) {
                        System.out.println(Thread.currentThread().getName() + "got both locks");
                        break;
                    }
                } finally {
                    if (got1) lock1.unlock();
                    if (got2) lock2.unlock();
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
//        Thread t1 = new Thread(task, "T1 ");
//        Thread t2 = new Thread(task, "T2 ");
//
//        t1.start();
//        t2.start();
        new Thread(task, "t1").start();
        new Thread(task, "t2").start();
    }
}
