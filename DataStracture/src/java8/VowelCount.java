package java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 10/8/2025
 */
public class VowelCount {
    public static void main(String[] args) {
        String input = "Beautiful Java Programming";

        Map<Character, Long> resultSetBased = vowelCountUsingSet(input);
        Map<Character, Long> resultStringBased = vowelCountUsingString(input);

        System.out.println("Using Set-based filter: " + resultSetBased);
        System.out.println("Using String-based filter: " + resultStringBased);
    }

    // Approach 1: Using a Set of vowels (clean & efficient)
    private static Map<Character, Long> vowelCountUsingSet(String input) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        return input.toLowerCase()
                .chars()
                .mapToObj(c -> (char) c)
                .filter(vowels::contains)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    // Approach 2: Using string indexOf() to check vowels
    private static Map<Character, Long> vowelCountUsingString(String input) {
        return input.toLowerCase()
                .chars()
                .mapToObj(c -> (char) c)
                .filter(ch -> "aeiou".indexOf(ch) >= 0)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}