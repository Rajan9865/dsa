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
public class GroupLength1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("rajan", "kumar", "raja", "kumari", "raj", "apple", "banana", "rajanana", "jitesh");
        Map<Integer, List<String>> result = groupByLength(names);
        print(result);
    }

    private static void print(Map<Integer, List<String>> result) {
        result.forEach((length, names) -> {
            System.out.println("Length: " + length + " -> Names: " + names);
        });
    }

    private static Map<Integer, List<String>> groupByLength(List<String> names) {
        return names.stream().collect(Collectors.groupingBy(String::length));
    }
}
