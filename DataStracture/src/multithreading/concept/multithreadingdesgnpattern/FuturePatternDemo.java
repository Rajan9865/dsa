package multithreading.concept.multithreadingdesgnpattern;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/21/2026
 */
public class FuturePatternDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(() -> {
            Thread.sleep(1000);
            return 10;
        });
        System.out.println("doing other work..");
        System.out.println("result " + future.get());
        executorService.shutdown();
    }
}
