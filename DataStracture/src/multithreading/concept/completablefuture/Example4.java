package multithreading.concept.completablefuture;

import java.util.concurrent.CompletableFuture;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/3/2026
 */
public class Example4 {
    public static void main(String[] args) {
        CompletableFuture.runAsync(() -> System.out.println("task1"))
                .thenRun(() -> System.out.println("task2"));
    }
}
