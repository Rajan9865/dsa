package multithreading;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 9/23/2025
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Running in: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("main thred is running " + Thread.currentThread().getName());
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
