package multithreading.Concept;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 3/31/2026
 */
public class BankSystem {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(6);
        for (int i = 1; i <= 11; i++) {
            int userId = i;
            executorService.submit(() -> {
                System.out.println("processing user " + userId + " By "
                        + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }
        executorService.shutdown();
    }
}
