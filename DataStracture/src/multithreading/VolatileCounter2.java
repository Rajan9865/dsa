package multithreading;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 10/9/2025
 */
public class VolatileCounter2 {
    private static volatile int count = 0;

    public static void main(String[] args) {
        int numberOfThreads = 10;
        Thread[] threads = new Thread[numberOfThreads];
        for (int i = 0; i < numberOfThreads; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    count++;
                }
                System.out.println(
                        Thread.currentThread().getName()
                );
            });
            threads[i].start();
        }
        for (int i = 0; i < numberOfThreads; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("final count 1000 " + count);
    }
}
