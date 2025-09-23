package java8;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 9/23/2025
 */
public class MostFrequentProducts {
    public static void main(String[] args) {
        Map<String, List<String>> products = new HashMap<>();
        products.put("fruits", Arrays.asList("apple", "banana", "mango", "banana"));
        products.put("vegetables", Arrays.asList("banana", "carrot", "broccoli"));
        products.put("drinks", Arrays.asList("banana", "coffee", "apple"));
        Map<String, Long> result = mostFrequentProducts(products);
        System.out.println(result);
        Long maxValues1 = findMaxFreq(result);
        List<String> mostFrequent = productName(result, maxValues1);
        System.out.println("most frequent product " + mostFrequent);
    }

    private static List<String> productName(Map<String, Long> maxValues, Long maxValues1) {
        return maxValues.entrySet().stream().filter(p -> p.getValue() == maxValues1)
                .map(Map.Entry::getKey).sorted(String::compareToIgnoreCase).collect(Collectors.toList());
    }

    private static long findMaxFreq(Map<String, Long> result) {
        return result.values().stream().mapToLong(Long::longValue).max().orElse(0);
    }

    private static Map<String, Long> mostFrequentProducts(Map<String, List<String>> products) {
        return products.values().stream().flatMap(List::stream).collect(groupingBy(p -> p, counting()));
    }
}
