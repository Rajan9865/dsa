package java8concept;

import java.util.Arrays;
import java.util.List;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 9/15/2025
 */
public class MultipleFilter {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 6, 7, 8, 9);
        list.stream().filter(num -> num % 2 == 0)
                .filter(num -> num > 5)
                .forEach(System.out::println);
    }
}
