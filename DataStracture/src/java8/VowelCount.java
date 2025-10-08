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
        Map<Character, Long> output = vowelCount(input);
        Map<Character, Long> output1 = vowelCount1(input);
        System.out.println(output);
        System.out.println(output1);
    }

    private static Map<Character, Long> vowelCount1(String input) {
        return input.toLowerCase().chars().mapToObj(c -> (char) c)
                .filter(p -> "aeiou".indexOf(p) >= 0)
                .collect(Collectors.groupingBy(Function.identity()
                        , Collectors.counting()));
    }

    private static Map<Character, Long> vowelCount(String input) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        return input.toLowerCase().chars().mapToObj(c -> (char) c)
                .filter(vowels::contains).collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()));
    }
}
