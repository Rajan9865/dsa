package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 8/20/2025
 */
public class GroupLength {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("apple", "banana", "cherry", "date", "fig", "grape");
        groupByLength(names);
    }

    private static void groupByLength(List<String> names) {
        Map<Integer, List<String>> output = names.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(output);
    }
}
