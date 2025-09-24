package multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 9/24/2025
 */
public class CallableExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Integer> task = () -> {
            System.out.println("computing in " + Thread.currentThread().getName());
            Thread.sleep(10000);
            return 45;
        };
        FutureTask<Integer> futureTask = new FutureTask<>(task);
        new Thread(futureTask).start();
        System.out.println("result " + futureTask.get());
    }
}
