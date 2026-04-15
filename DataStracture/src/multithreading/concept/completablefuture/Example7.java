package multithreading.concept.completablefuture;

import java.util.concurrent.CompletableFuture;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/3/2026
 */
public class Example7 {
    public static void main(String[] args) {
        CompletableFuture<Integer> f1 = CompletableFuture.supplyAsync(() -> 10);
        CompletableFuture<Integer> f2 = CompletableFuture.supplyAsync(() -> 20);
        CompletableFuture<Object> anyDone = CompletableFuture.anyOf(f1, f2);
        System.out.println("first result: " + anyDone.join());
    }
}
