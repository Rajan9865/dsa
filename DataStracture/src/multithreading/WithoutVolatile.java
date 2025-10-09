package multithreading;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 10/9/2025
 */
public class WithoutVolatile {
    private static boolean running = true;

    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getState());
        Thread thread = new Thread(() -> {
            System.out.println("inside thread " + Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getState());
            while (running) {

            }
            System.out.println("stopped");
        });
        thread.start();
        Thread.sleep(1000);
        running = false;
        System.out.println("flag set to false");
        System.out.println(thread.getState());
        System.out.println(thread.getName());
    }
}
