package java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 9/22/2025
 */
public class MaxDistinctCategory {
    public static void main(String[] args) {
        Map<String, List<String>> products = new HashMap<>();
        products.put("fruits", Arrays.asList("apple", "banana", "mango", "banana"));
        products.put("vegetables", Arrays.asList("carrot", "broccoli"));
        products.put("drinks", Arrays.asList("coffee", "tea", "mango"));
        Map<String, Long> result = maxDistinctCategory(products);
        Map.Entry<String, Long> result1 = printResult(result);
        System.out.println(result1.getKey() + " = " + result1.getValue());
    }

    private static Map.Entry<String, Long> printResult(Map<String, Long> result) {
        return result.entrySet().stream().max(Map.Entry.comparingByValue()).orElseThrow(()
                -> new RuntimeException("no categories found"));
    }

    private static Map<String, Long> maxDistinctCategory(Map<String, List<String>> products) {
        return products.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey,
                e -> e.getValue().stream().distinct().count()));
    }
}
