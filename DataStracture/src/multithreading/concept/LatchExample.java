package multithreading.concept;

import java.util.concurrent.CountDownLatch;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/14/2026
 */
public class LatchExample {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(3);
        Runnable task = () -> {
            System.out.println(Thread.currentThread().getName() + " working....");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            latch.countDown();
        };
        for (int i = 0; i < 3; i++) {
            new Thread(task).start();
        }
        latch.await();
        System.out.println("all threads finished. proceeding...");
    }
}
