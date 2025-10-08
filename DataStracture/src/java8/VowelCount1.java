package java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 10/8/2025
 */
public class VowelCount1 {
    public static void main(String[] args) {
        String input = "Beautiful Java Programming";
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        Map<Character, Long> vowelCount = vowelCountUsingSet(input, vowels);
        System.out.println(vowelCount);
        Map<Character, Long> constantCount = constantCountUsingSet(input, vowels);
        System.out.println(constantCount);
    }

    private static Map<Character, Long> constantCountUsingSet(String input, Set<Character> vowels) {
        return input.toLowerCase().chars()
                .mapToObj(c -> (char) c)
                .filter(c -> !vowels.contains(c))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    private static Map<Character, Long> vowelCountUsingSet(String input, Set<Character> vowels) {
        return input.toLowerCase().chars().mapToObj(c -> (char) c)
                .filter(vowels::contains)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
