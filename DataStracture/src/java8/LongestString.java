package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 9/29/2025
 */
public class LongestString {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "mango", "strawberry", "kiwi");
        Optional<String> output = longestString(fruits);
        output.ifPresent(s -> System.out.println(s));
    }

    private static Optional<String> longestString(List<String> fruits) {
        // using Stream.max
        return fruits.stream().max(Comparator.comparingInt(String::length));

        //  using Collectors.maxBy
        //return fruits.stream().collect(Collectors.maxBy(Comparator.comparingInt(String::length)));
        
        // using Collections.max directly
        //return fruits.isEmpty() ? Optional.empty() : Optional.of(Collections.
        //max(fruits, Comparator.comparingInt(String::length)));
    }
}
