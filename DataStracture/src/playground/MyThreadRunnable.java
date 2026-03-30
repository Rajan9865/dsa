package playground;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 3/30/2026
 */
class MyThread1 implements Runnable {
    public void run() {
        System.out.println("MyThread run using implementation of runnable interface ");
    }

}

public class MyThreadRunnable {
    public static void main(String[] args) {
        Thread t = new Thread(new MyThread1());
        t.start();
    }
}
