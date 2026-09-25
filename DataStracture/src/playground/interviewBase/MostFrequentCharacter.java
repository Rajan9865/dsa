package playground.interviewBase;

import java.util.Collections;
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
public class MostFrequentCharacter {
    static void main() {
        String str = "programming";
//        Character result = mostFrequentCharacter(str);
        Character result = mostFrequentCharacterAnotherApproach(str);
        System.out.println(" most frequent character result is " + result);
    }

    private static Character mostFrequentCharacterAnotherApproach(String str) {
        Map<Character, Long> collect = str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        return Collections.max(collect.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    private static Character mostFrequentCharacter(String str) {
        Map<Character, Long> frequencycount = str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        return frequencycount.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
    }
}
