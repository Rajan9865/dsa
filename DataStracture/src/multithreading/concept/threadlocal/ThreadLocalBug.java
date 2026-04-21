package multithreading.concept.threadlocal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/17/2026
 */
import java.util.concurrent.*;

public class ThreadLocalBug {

    private static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(1);

        executor.submit(() -> {
            threadLocal.set("User1");
            System.out.println("Task1: " + threadLocal.get());
        });

        executor.submit(() -> {
            System.out.println("Task2: " + threadLocal.get());
        });

        executor.shutdown();
    }
}
