package revision;

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
public class firstNonRepeatingCharacter {
    static void main() {
        String name = "abbcus";
        char result = firstNoneRepatingCharacher(name);
        char result2 = firstNoneRepatingCharacherUsingJava8(name);
        System.out.println(result2);
//        System.out.println(result);
    }

    private static Character firstNoneRepatingCharacherUsingJava8(String name) {
        return name.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElse(null);
    }

    private static Character firstNoneRepatingCharacher(String name) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : name.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : name.toCharArray()) {
            if (map.get(c) == 1) {
                return c;
            }
        }
        return null;
    }
}
