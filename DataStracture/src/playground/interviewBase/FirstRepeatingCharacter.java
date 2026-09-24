package playground.interviewBase;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 9/24/2026
 */
public class FirstRepeatingCharacter {
    static void main() {
        String str = "swiss";
//        System.out.println("First Repeating Character : " + firstRepatingCharacter(str));
//        System.out.println("First Repeating Character : " + firstRepatingCharacter1(str));
        System.out.println("First Repeating Character : " + firstRepatingCharacterUsingJava8(str));
    }

    private static Character firstRepatingCharacterUsingJava8(String str) {
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Long> collect = str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        return collect.entrySet().stream().filter(entry -> entry.getValue() > 1)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElse(null);
    }

    private static char firstRepatingCharacter1(String str) {
        Set<Character> set = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (set.contains(c)) {
                return c;
            }
            set.add(c);
        }
        return '\0';
    }

    private static char firstRepatingCharacter(String str) {
        Map<Character, Integer> map = new HashMap<>();
//        for (char c : str.toCharArray()) {
//            map.put(c, map.getOrDefault(c, 0) + 1);
//        }
        for (char c : str.toCharArray()) {
            if (map.containsKey(c)) {
                return c;
            }
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return '\0';
    }
}
