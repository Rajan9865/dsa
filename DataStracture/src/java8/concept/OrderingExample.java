package java8.concept;

import java.util.Arrays;
import java.util.List;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/7/2026
 */
public class OrderingExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        System.out.println("unordered list: " + list);
        list.parallelStream().forEach(System.out::print);
        System.out.println("\nordered list: " + list);
        list.parallelStream().forEachOrdered(System.out::print);
    }
}
