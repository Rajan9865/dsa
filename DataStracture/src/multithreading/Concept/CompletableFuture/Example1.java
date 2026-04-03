package multithreading.Concept.CompletableFuture;

import java.util.concurrent.CompletableFuture;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/3/2026
 */
public class Example1 {
    public static void main(String[] args) {
        CompletableFuture<Integer> cf = CompletableFuture.supplyAsync(() -> 10);
        System.out.println("CompletableFuture.supplyAsync() = " + cf.join());
    }
}
