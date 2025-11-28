package java8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 11/28/2025
 */
public class DuplicateCharacters {
    public static void main(String[] args) {
        String name = "Programming";
        Map<Character, Long> countCharacter = countCharacter(name);
        Map<Character, Long> output = duplicateCharacter(countCharacter);
        System.out.println(output);
    }

    private static Map<Character, Long> duplicateCharacter(Map<Character, Long> countCharacter) {
        return countCharacter.entrySet().stream().filter(e -> e.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    private static Map<Character, Long> countCharacter(String name) {
        return name.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
