package multithreading.Concept.deadLockPrevent;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/8/2026
 */
public class PreventDeadlockUsingSingleLock {
    private static final Object lock = new Object();

    public static void main(String[] args) {
        Runnable task = () -> {
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName() + " working safely");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        new Thread(task, "t1").start();
        new Thread(task, "t2").start();
    }
}
