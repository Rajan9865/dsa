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
public class VowelCount2 {
    public static void main(String[] args) {
        String input = "Beautiful Java Programming";
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        Map<Boolean, Map<Character, Long>> output = vowelandConstantsCount(input, vowels);
        System.out.println("vowel count " + output.get(true));
        System.out.println("constant count " + output.get(false));
    }

    private static Map<Boolean, Map<Character, Long>> vowelandConstantsCount(String input, Set<Character> vowels) {
        return input.toLowerCase().chars().mapToObj(c -> (char) c)
                .filter(Character::isLetter).collect(Collectors.partitioningBy(vowels::contains,
                        Collectors.groupingBy(Function.identity(), Collectors.counting())));
    }
}
