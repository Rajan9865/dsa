package playground;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 3/30/2026
 */
class MyThread extends Thread {

    public void run() {
        System.out.println("MyThread run");
    }
}

public class MyThreadMainClass {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
