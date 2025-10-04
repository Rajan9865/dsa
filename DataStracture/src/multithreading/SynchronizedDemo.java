package multithreading;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 10/4/2025
 */
public class SynchronizedDemo {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizedDemo synchronizedDemo = new SynchronizedDemo();
        Runnable runnable = () -> {
            for (int i = 0; i < 2000; i++) {
                synchronizedDemo.increment();
            }
        };
        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(runnable);

        thread.start();
        thread1.start();

        thread.join();
        thread1.join();

        System.out.println("Final count (expected 2000): " + synchronizedDemo.count);
    }
}
