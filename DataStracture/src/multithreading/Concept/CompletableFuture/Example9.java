package multithreading.Concept.CompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/3/2026
 */
public class Example9 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> 100, executorService);
        System.out.println("first result: " + completableFuture.join());
        executorService.shutdown();
    }
}
