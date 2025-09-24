package java8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 9/24/2025
 */
public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        String words = "swwiiss";
        Map<Character, Long> result = firstNonRepeatingCharacter(words);
        System.out.println(result);
        Optional<Character> output = printFirstElement(result);
        printOutput(output);
    }

    private static void printOutput(Optional<Character> output) {
//        output.ifPresent(s -> System.out.println("first non repeating character " + s));
        System.out.println(output.isPresent() ? "first non repating cahracter " + output.get() :
                "no repating character are found");
    }

    private static Optional<Character> printFirstElement(Map<Character, Long> result) {
        return result.entrySet().stream().filter(p -> p.getValue() == 1)
                .map(Map.Entry::getKey).findFirst();
    }

    private static Map<Character, Long> firstNonRepeatingCharacter(String words) {
        return words.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(),
                LinkedHashMap::new, Collectors.counting()));
    }
}
