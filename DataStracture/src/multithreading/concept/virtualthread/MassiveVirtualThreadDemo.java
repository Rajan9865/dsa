package multithreading.concept.virtualthread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/27/2026
 */
public class MassiveVirtualThreadDemo {
    public static void main(String[] args) {
        try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {
            for (int i = 0; i < 10000; i++) {
                executor.submit(() -> {
                    System.out.println("task executed by " + Thread.currentThread());
                });
            }
        }
    }
}
