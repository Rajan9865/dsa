package multithreading.Concept.CompletableFuture;

import java.util.concurrent.CompletableFuture;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/3/2026
 */
public class Example3 {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> 10)
                .thenAccept(result -> System.out.println(result));
    }
}
