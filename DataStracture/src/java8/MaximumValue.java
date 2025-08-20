package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 8/20/2025
 */
public class MaximumValue {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5);
        int result = maximumValue(number);
        System.out.println("Maximum value in the list is: " + result);

        List<String> names = Arrays.asList("rajan", "kumar", "java8");
        List<String> result1 = upperacase(names);
        print(result1);
    }

    private static void print(List<String> result1) {
        result1.forEach(s -> System.out.print(s + " "));
    }

    private static List<String> upperacase(List<String> names) {
        return names.stream().map(String::toUpperCase).collect(Collectors.toList());
    }

    private static int maximumValue(List<Integer> number) {
        return number.stream().max(Integer::compare).orElseThrow(() -> new IllegalArgumentException("list is empty"));
    }
}
