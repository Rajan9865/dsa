package multithreading.concept;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/14/2026
 */
public class BarrierExample {
    public static void main(String[] args) throws InterruptedException, BrokenBarrierException {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, () -> {
            System.out.println(" all thread reached barrier. let's processed");
        });
        Runnable runnable = () -> {
            System.out.println(Thread.currentThread().getName() + " working ...");
            try {
                Thread.sleep(1000);
                cyclicBarrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " barrier passed completed");
        };
        for (int i = 0; i < 3; i++) {
            new Thread(runnable).start();
        }
    }
}
