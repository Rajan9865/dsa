package multithreading.concept;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/22/2026
 */
public class ThreadPoolTuningDemo {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                4, 8, 60, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(50),
                new ThreadPoolExecutor.CallerRunsPolicy()
        );
        Runnable task = () -> {
            System.out.println(Thread.currentThread().getName() + " executing  task...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " executing " + i);
            threadPoolExecutor.submit(task);
        }
        threadPoolExecutor.shutdown();
    }
}
