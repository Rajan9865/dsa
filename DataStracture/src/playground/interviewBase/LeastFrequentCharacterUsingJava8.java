package playground.interviewBase;

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
public class LeastFrequentCharacterUsingJava8 {
    static void main() {
        String str = "aabbccd";
        Character result = leastFrequentCharacterUsingJava8(str);
        System.out.println("least frequent character :" + result);
    }

    private static Character leastFrequentCharacterUsingJava8(String str) {
        LinkedHashMap<Character, Long> collect = str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        return collect.entrySet()
                .stream()
                .min(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);

    }
}
