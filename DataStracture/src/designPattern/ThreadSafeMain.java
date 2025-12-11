package designPattern;

/**
 * Demonstrates the use of a <b>Thread-Safe Lazy Singleton</b> using the
 * Double-Checked Locking pattern.
 *
 * <p>This program creates multiple threads (10 workers). Each thread attempts to
 * access the singleton instance concurrently. The goal is to prove that only
 * <b>one instance</b> is created, ensuring thread safety.</p>
 *
 * <p><b>What this program demonstrates:</b></p>
 * <ul>
 *     <li>Thread-safe lazy initialization of Singleton</li>
 *     <li>Use of <code>volatile</code> with Double-Checked Locking (DCL)</li>
 *     <li>Ensuring only one object is created even in multithreaded environment</li>
 *     <li>How different threads access the same Singleton instance</li>
 * </ul>
 *
 * @author Rajan Kumar
 * @version 1.0
 * @since 12/08/2025
 */
public class ThreadSafeMain {
    /**
     * Main method used to simulate multiple threads accessing the Singleton
     * instance at the same time.
     *
     * @param args command line arguments (not used)
     * @throws InterruptedException when a thread join is interrupted
     */
    public static void main(String[] args) throws InterruptedException {
        final int THREAD_COUNT = 10;
        Thread[] threads = new Thread[THREAD_COUNT];

        for (int i = 0; i < THREAD_COUNT; i++) {
            Runnable task = () -> {
                ThreadSafeSingleton instance = ThreadSafeSingleton.getInstance();
                instance.show();
                System.out.println(Thread.currentThread().getName() + " -> " + instance
                        + " hash:" + System.identityHashCode(instance));
            };
            threads[i] = new Thread(task, "Worker-" + i);
        }

        for (Thread t : threads) {
            t.start();
        }
        for (Thread t : threads) {
            t.join();
        }

        ThreadSafeSingleton s1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton s2 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton s3 = ThreadSafeSingleton.getInstance();

        System.out.println(s1 + " " + Thread.currentThread().getName());
        System.out.println(s2 + " " + Thread.currentThread().getName());
        System.out.println(s3 + " " + Thread.currentThread().getName());

        if (s1 == s2 && s2 == s3) {
            System.out.println("All are SAME instance (Thread-safe Singleton Working!)");
        } else {
            System.out.println("Different instances (FAILED)");
        }
    }
}

/**
 * Thread-Safe Lazy Singleton using <b>Double-Checked Locking</b>.
 *
 * <p>This implementation ensures:</p>
 * <ul>
 *     <li>Object is created lazily (only when requested)</li>
 *     <li>The instance is created only once</li>
 *     <li>Thread-safe access without unnecessary synchronization overhead</li>
 *     <li><code>volatile</code> prevents instruction reordering issues</li>
 * </ul>
 *
 * <p><b>Why Double-Checked Locking?</b></p>
 * <p>
 * Without DCL, every <code>getInstance()</code> call would require entering a synchronized block,
 * which is slow. DCL ensures synchronization happens <i>only once</i> when the instance
 * is created.
 * </p>
 */
class ThreadSafeSingleton {
    private static volatile ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Thread-Safe Lazy Singleton Object Created! using constructor");
    }

    /**
     * Returns the singleton instance using Double-Checked Locking (DCL).
     *
     * <p><b>Flow:</b></p>
     * <ul>
     *     <li>First null check (fast path)</li>
     *     <li>Synchronized block → ensures thread safety</li>
     *     <li>Second null check → prevents duplicate creation</li>
     * </ul>
     *
     * @return the single instance of ThreadSafeSingleton
     */
    public static ThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }

    /**
     * Simple method to demonstrate instance behavior.
     */
    public void show() {
        System.out.println("public show methods ");
    }
}