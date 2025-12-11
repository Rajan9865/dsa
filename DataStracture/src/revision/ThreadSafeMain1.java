package revision;


/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 12/11/2025
 */
public class ThreadSafeMain1 {
    public static void main(String[] args) {
        final int THREAD_COUNT = 100;
        Thread[] threads = new Thread[THREAD_COUNT];
        for (int i = 0; i < THREAD_COUNT; i++) {
            Runnable task = () -> {
                ThreadSafeSingleton1 e1 = ThreadSafeSingleton1.getInstance();
                e1.print();
                System.out.println(Thread.currentThread().getName() + " -> " + e1
                        + " hash:" + System.identityHashCode(e1));
            };
            threads[i] = new Thread(task, "worker -" + i);
        }
        for (Thread thread : threads) {
            thread.start();
        }
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        ThreadSafeSingleton1 e1 = ThreadSafeSingleton1.getInstance();
        ThreadSafeSingleton1 e2 = ThreadSafeSingleton1.getInstance();
        ThreadSafeSingleton1 e3 = ThreadSafeSingleton1.getInstance();
        if (e1 == e2 && e1 == e3) {
            System.out.println("all are same instance");
        } else {
            System.out.println("different instance");
        }
    }
}

class ThreadSafeSingleton1 {

    private static volatile ThreadSafeSingleton1 instance;

    private ThreadSafeSingleton1() {
        System.out.println("ThreadSafeSingleton1 init constructor print ");
    }

    public static ThreadSafeSingleton1 getInstance() {
        {
            if (instance == null) {
                synchronized (ThreadSafeSingleton1.class) {
                    if (instance == null) {
                        instance = new ThreadSafeSingleton1();
                    }
                }
            }
            return instance;
        }
    }

    public void print() {
        System.out.println("ThreadSafeSingleton1 print");
    }
}
