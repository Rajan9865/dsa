package java8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 8/25/2025
 */
public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String input = "swiss";
        Character result = firstNonRepeatingCharacter(input);
        if (result != null) {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("All characters are repeating.");
        }
    }

    private static Character firstNonRepeatingCharacter(String input) {
        Map<Character, Long> charCountMap = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return input.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> charCountMap.get(c) == 1)
                .findFirst()
                .orElse(null);
    }
}
