package multithreading.concept;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/7/2026
 */
public class StarvationDemo {
    public static void main(String[] args) {
        Thread high = new Thread(() -> {
            while (true) {
                System.out.println("high priority running ..");
            }
        });
        Thread low = new Thread(() -> {
            while (true) {
                System.out.println("low priority running ..");
            }
        });
        high.setPriority(Thread.MAX_PRIORITY);
        low.setPriority(Thread.MIN_PRIORITY);
        high.start();
        low.start();
    }
}
