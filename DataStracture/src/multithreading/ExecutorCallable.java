package multithreading;

import java.util.concurrent.*;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 9/24/2025
 */
public class ExecutorCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Callable<String> task = () -> {
            Thread.sleep(1000);
            return "hello from" + Thread.currentThread().getName();
        };
        Future<String> future = executorService.submit(task);
        System.out.println("result =" + future.get());
        executorService.shutdown();
    }
}
