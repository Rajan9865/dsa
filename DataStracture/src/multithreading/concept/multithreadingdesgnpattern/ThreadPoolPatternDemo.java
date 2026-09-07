package multithreading.concept.multithreadingdesgnpattern;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/21/2026
 */
public class ThreadPoolPatternDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            executorService.submit(() -> {
                System.out.println(Thread.currentThread().getName());
            });
        }
        executorService.shutdown();
    }
}
