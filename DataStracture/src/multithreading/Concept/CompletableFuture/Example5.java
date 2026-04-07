package multithreading.Concept.CompletableFuture;

import java.util.concurrent.CompletableFuture;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/3/2026
 */
public class Example5 {
    public static void main(String[] args) {
        CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> 10);
        CompletableFuture<Integer> completableFuture2 = CompletableFuture.supplyAsync(() -> 20);
        CompletableFuture<Integer> result = completableFuture.thenCombine(completableFuture2, (x, y) -> x + y);
        System.out.println("result: " + result.join());
    }
}
