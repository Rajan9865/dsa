package playground.interviewBase;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 9/25/2026
 */
public class DuplicateCharacters {
    static void main() {
        String str = "programming";
        List<Character> result = findDuplicateCharacter(str);
        List<Character> result = findDuplicateCharacterUsingTradinationalApproach(str);
        System.out.println("duplicate characters: " + result);

    }

    private static List<Character> findDuplicateCharacter(String str) {
        Map<Character, Long> frequencyCount = str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        return frequencyCount.entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
