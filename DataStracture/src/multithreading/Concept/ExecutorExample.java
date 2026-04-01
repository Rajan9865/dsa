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
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(() -> {
            System.out.println("running  in :" + Thread.currentThread().getName());
        });
        executorService.shutdown();
    }
}
