package multithreading;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 9/24/2025
 */
public class MyRunnable1 implements Runnable {

    @Override
    public void run() {
        System.out.println("running task in " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("main running in " + Thread.currentThread().getName());
        Thread thread = new Thread(new MyRunnable1());
        thread.start();
    }
}
