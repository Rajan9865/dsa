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
 * @since 9/25/2026
 */
public class CharacterFrequency {
    static void main() {
        String str = "programming";
        Map<Character, Integer> result = countFrequancy(str);
//        Map<Character, Long> result1 = countFrequancyUsingJava8(str);
        Map<Character, Long> result1 = countFrequancyUsingJava81(str);
        System.out.println("frequency of programming using java 8 " + result1);
        System.out.println("frequency of programming: " + result);
    }

    private static Map<Character, Long> countFrequancyUsingJava81(String str) {
        return str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
    }

    private static Map<Character, Long> countFrequancyUsingJava8(String str) {
        return str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    private static Map<Character, Integer> countFrequancy(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }
}
