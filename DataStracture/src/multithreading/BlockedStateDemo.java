package multithreading;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 9/29/2025
 */
public class BlockedStateDemo {
    public static void main(String[] args) throws InterruptedException {
        Runnable syncTask = () -> {
            synchronized (BlockedStateDemo.class) {
                try {
                    Thread.sleep(2000); // hold lock
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(syncTask);
        Thread t2 = new Thread(syncTask);

        t1.start();
        Thread.sleep(100);
        t2.start();

        Thread.sleep(500);
        System.out.println("t1 state: " + t1.getState()); // TIMED_WAITING
        System.out.println("t2 state: " + t2.getState()); // BLOCKED
    }
}
