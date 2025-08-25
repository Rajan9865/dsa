package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 8/25/2025
 */
public class Concatenatestrings {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Rajan", "Kumar", "Java", "8");
        String result = concatenateNames(names);
        System.out.println(result);
    }

    private static String concatenateNames(List<String> names) {
        return names.stream().collect(Collectors.joining(" "));
    }
}
