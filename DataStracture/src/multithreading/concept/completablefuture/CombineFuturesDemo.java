package multithreading.concept.completablefuture;

import java.util.concurrent.CompletableFuture;


/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/20/2026
 */
public class CombineFuturesDemo {
    public static void main(String[] args) {

        CompletableFuture<Integer> f1 =
                CompletableFuture.supplyAsync(() -> {
                    sleep(1000);
                    return 10;
                });

        CompletableFuture<Integer> f2 =
                CompletableFuture.supplyAsync(() -> {
                    sleep(1000);
                    return 20;
                });

        CompletableFuture<Integer> result =
                f1.thenCombine(f2, (a, b) -> a + b);

        System.out.println("Combined result: " + result.join());
    }

    private static void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (Exception e) {
        }
    }
}
