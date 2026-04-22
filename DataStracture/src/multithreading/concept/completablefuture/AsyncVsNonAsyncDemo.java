package multithreading.concept.completablefuture;

import java.util.concurrent.CompletableFuture;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/20/2026
 */
public class AsyncVsNonAsyncDemo {
    public static void main(String[] args) {
        CompletableFuture<Void> future =
                CompletableFuture.supplyAsync(() -> 10)
                        .thenApply(x -> {
                            System.out.println("thenApply thread: " + Thread.currentThread().getName());
                            return x * 2;
                        })
                        .thenApplyAsync(x -> {
                            System.out.println("thenApplyAsync thread: " + Thread.currentThread().getName());
                            return x + 5;
                        })
                        .thenAccept(result -> System.out.println("Final result: " + result));

        future.join();
    }
}
