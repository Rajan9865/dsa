package multithreading;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 10/9/2025
 */
public class WithVolatile {
    private static volatile boolean running = true;

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            while (running) {
            }
            System.out.println("thread stopped");
        });
        thread.start();
        Thread.sleep(1000);
        running = false;
        System.out.println("flag set to flase ");
    }
}
