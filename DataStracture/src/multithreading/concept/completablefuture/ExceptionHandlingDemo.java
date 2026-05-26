package multithreading.concept.completablefuture;

import java.util.concurrent.CompletableFuture;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/20/2026
 */
public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            if (true) throw new RuntimeException("run occured");
            return 10;
        }).exceptionally(ex -> {
            System.out.println("handle exception" + ex.getMessage());
            return -1;
        });
        System.out.println("result " + future.join());
    }
}
