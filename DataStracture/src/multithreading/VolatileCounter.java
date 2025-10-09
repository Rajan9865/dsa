package multithreading;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 10/9/2025
 */
public class VolatileCounter {
    private static volatile int count = 0;

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            for (int i = 0; i < 1000; i++) {
                count++;
            }
        };
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.join();
        thread2.start();
        thread1.join();
        System.out.println("Final count (expected 2000): " + count);
    }
}
