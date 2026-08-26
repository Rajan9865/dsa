package multithreading.concept.completablefuture;

import java.util.concurrent.CompletableFuture;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/20/2026
 */
public class ThenApplyVsCompose {
    public static void main(String[] args) {
        CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> 10)
                .thenApply(x -> x * 2);
        CompletableFuture<Integer> completableFuture1 = CompletableFuture.supplyAsync(() -> 10)
                .thenCompose(x -> CompletableFuture.supplyAsync(() -> x * 2));
        System.out.println("thenApply: " + completableFuture.join());
        System.out.println("then compose: " + completableFuture1.join());
    }
}
