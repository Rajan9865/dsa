package multithreading;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 9/23/2025
 */
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("running in" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("main running in " + Thread.currentThread().getName());
        Thread thread = new Thread(new MyRunnable());
        thread.start();
        Runnable task = () -> System.out.println("lamdba running in " + Thread.currentThread().getName());
        Thread thread1 = new Thread(task);
        thread1.start();
    }
}
