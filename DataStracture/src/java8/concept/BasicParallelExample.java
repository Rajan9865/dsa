package java8.concept;

import java.util.Arrays;
import java.util.List;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/7/2026
 */
public class BasicParallelExample {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
//        List<Integer> list = Arrays.asList(1, 25);
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
//        System.out.println("Sequential:");
//        list.stream().forEach(i -> System.out.println(Thread.currentThread().getName()));
        System.out.println("\nParallel:");
        list.parallelStream().forEach(i -> System.out.println(Thread.currentThread().getName()));
    }
}
