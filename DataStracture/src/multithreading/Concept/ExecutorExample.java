package multithreading.Concept;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 3/30/2026
 */
public class ExecutorExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Runnable task = () -> {
            System.out.println("Running in: " + Thread.currentThread().getName());
        };
        // Submit multiple tasks
        for (int i = 0; i < 5; i++) {
            executor.submit(task);
        }
        executor.shutdown();
    }
}
