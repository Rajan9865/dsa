package playground.interviewBase;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 9/29/2026
 */
public class FirstNonRepeatingCharacterUsingJava8 {
    static void main() {
        String str = "swwiss";
//        Character result = firstNonRepeatingCharacter(str);
//        Character result = firstNonRepeatingCharacterUsingTraditional(str);
        Character result = firstNonRepeatingCharacterUsingTraditionalTraditional(str);
        System.out.println(" first non-repeating character: " + result);
    }

    private static Character firstNonRepeatingCharacterUsingTraditionalTraditional(String str) {
        return null;
    }

    private static Character firstNonRepeatingCharacterUsingTraditional(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return null;
    }

    private static Character firstNonRepeatingCharacter(String str) {
        LinkedHashMap<Character, Long> frequencyCount = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        return frequencyCount.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
    }

}
