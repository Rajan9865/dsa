package multithreading.concept;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/7/2026
 */
public class DeadlockExample {
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("t1 lock1 acquired");
                synchronized (lock2) {
                    System.out.println("t1 lock2 acquired");
                }
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("t2 lock2 acquired");
                synchronized (lock1) {
                    System.out.println("t2 lock1 acquired");
                }
            }
        });
        t1.start();
        t2.start();
    }
}
