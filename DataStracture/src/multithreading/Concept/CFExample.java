package multithreading.Concept;

import java.util.concurrent.CompletableFuture;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/3/2026
 */
public class CFExample {
    public static void main(String[] args) {
        System.out.println("main thread started " + Thread.currentThread().getName());
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            System.out.println("running async task " + Thread.currentThread().getName());
        });
        future.join();
        System.out.println("main thread finished");
    }
}
