package multithreading.concept;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/7/2026
 */
public class LivelockDemo {
    static volatile boolean flag = true;

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            while (flag) {
                System.out.println("T1: giving chance to T2");
                flag = false;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread t2 = new Thread(() -> {
            while (!flag) {
                System.out.println("T2: giving chance to T1");
                flag = true;
            }
        });

        t1.start();
        t2.start();
    }
}
