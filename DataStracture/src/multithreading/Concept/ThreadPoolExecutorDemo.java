package multithreading.Concept;

import java.util.concurrent.*;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/2/2026
 */
public class ThreadPoolExecutorDemo {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                2, // core pool size
                4, // maximum pool size
                10, TimeUnit.SECONDS, // keep-alive time
                new ArrayBlockingQueue<>(10), // queue capacity
                Executors.defaultThreadFactory(), // thread factory
                new ThreadPoolExecutor.AbortPolicy() // rejection policy
        );
        Runnable task = () -> {
            System.out.println(" running in  " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        for (int i = 0; i < 10; i++) {
            try {
                executor.submit(task);
                System.out.println("task " + (i + 1) + " is submitted");
            } catch (RejectedExecutionException e) {
                System.out.println("task " + (i + 1) + " is rejected");
            }
        }
        executor.shutdown();
    }
}
