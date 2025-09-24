package multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 9/24/2025
 */
public class ExecutorCallable {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Callable<String> task = () -> {
            Thread.sleep(1000);
            return "hello from" + Thread.currentThread().getName();
        };

    }
}
