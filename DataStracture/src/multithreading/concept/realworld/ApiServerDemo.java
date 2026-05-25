package multithreading.concept.realworld;

import java.util.concurrent.*;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/23/2026
 */
public class ApiServerDemo {
    public static void main(String[] args) {
        ExecutorService excecutor = new ThreadPoolExecutor(2, 2,
                60, TimeUnit.SECONDS, new ArrayBlockingQueue<>(2),
                new ThreadPoolExecutor.CallerRunsPolicy());
        Runnable task = () -> {
            System.out.println(Thread.currentThread().getName() + " handling requess  ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        for (int i = 0; i < 10; i++) {
            excecutor.execute(task);
        }
        excecutor.shutdown();
    }
}
