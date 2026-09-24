package playground;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 9/24/2026
 */
public class FirstNonRepatingCharacter {
    static void main() {
        String str = "swiss";
        System.out.println("First non repeating character is: " + firstNonRepeatingCharacter(str));
        System.out.println("First non repeating character is: " + FirstNonRepeatingCharacterUsingjava8(str));
    }

    private static Character FirstNonRepeatingCharacterUsingjava8(String str) {
        return str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
    }

    private static char firstNonRepeatingCharacter(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : str.toCharArray()) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }
        return '\0';
    }
}
