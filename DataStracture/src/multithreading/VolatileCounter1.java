package multithreading;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 10/9/2025
 */
public class VolatileCounter1 {
    private static volatile int count = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                count++;
            }
            System.out.println("thread 1 is finished");
        });
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                count++;
            }
            System.out.println("thread 2 is finished");
        });
        thread.start();
        thread1.start();
        thread1.join();
        thread.join();
        System.out.println("final count is 2000 := " + count);
    }
}
