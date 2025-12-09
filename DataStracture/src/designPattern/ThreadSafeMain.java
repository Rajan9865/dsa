package designPattern;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 12/8/2025
 */
public class ThreadSafeMain {
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

class ThreadSafeSingleton {
    private static volatile ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
        // simulate some work during construction to expose race conditions if any
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Thread-Safe Lazy Singleton Object Created! using constructor");
    }

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

    public void show() {
        System.out.println("public show methods ");
    }
}