package multithreading.concept.completablefuture;

import java.util.concurrent.CompletableFuture;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/3/2026
 */
public class Example8 {
    public static void main(String[] args) {
        CompletableFuture<Integer> future =
                CompletableFuture.<Integer>supplyAsync(() -> {
                            throw new RuntimeException("Error!");
                        })
                        .exceptionally(ex -> {
                            System.out.println("Handled: " + ex.getMessage());
                            return -1;
                        });

        System.out.println("Result: " + future.join());
    }
}
