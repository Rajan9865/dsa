package multithreading.concept.realworld;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/23/2026
 */
public class OrderProcessingSystem {
    public static void main(String[] args) {
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(5);
        ExecutorService worker = Executors.newFixedThreadPool(2);
        new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    blockingQueue.put("order- " + i);
                    System.out.println("placed order- " + i);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
        worker.submit(() -> {
            while (true) {
                try {
                    String take = blockingQueue.take();
                    System.out.println("processing order- " + take);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
