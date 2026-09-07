package multithreading.concept.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/20/2026
 */
public class TimeoutDemo {
    public static void main(String[] args) {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    return "result";
                }).orTimeout(2, TimeUnit.SECONDS)
                .exceptionally(ex -> "time occured");
        System.out.println("result " + future.join());

    }
}
