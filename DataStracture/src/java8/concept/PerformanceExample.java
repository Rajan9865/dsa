package java8.concept;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/7/2026
 */
public class PerformanceExample {
    public static void main(String[] args) {
        List<Integer> list = IntStream.range(0, 10000000).boxed().collect(Collectors.toList());
        long starttime = System.currentTimeMillis();
        long sum = list.stream().mapToLong(i -> i).sum();
        long endTime = System.currentTimeMillis();
        System.out.println("Sum: " + sum);
        System.out.println("Time: " + (endTime - starttime));
    }
}
