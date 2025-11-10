package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 11/10/2025
 */
public class MostFrequentElement {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        Map<String, Long> frequencyMap = frequeny(items);
        long maxFrequency = maxFrequency(frequencyMap);
        List<String> mostFrequent = mostFrequent(maxFrequency, frequencyMap);
        System.out.println("most frequent element " + mostFrequent);
        System.out.println("frequency " + maxFrequency);
    }

    private static List<String> mostFrequent(long maxFrequency, Map<String, Long> frequencyMap) {
        return frequencyMap.entrySet().stream().filter(e -> e.getValue() == maxFrequency)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    private static long maxFrequency(Map<String, Long> frequencyMap) {
        return frequencyMap.values().stream().mapToLong(Long::longValue).max().orElse(0);
    }

    private static Map<String, Long> frequeny(List<String> items) {
        return items.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
