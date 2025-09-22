package java8;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Rajan Kumar
 * @version 1.0
 * Dsa
 * @since 9/21/2025
 */
public class TopNPerCategory {
    public static void main(String[] args) {
        Map<String, List<String>> products = new HashMap<>();
        products.put("fruits", Arrays.asList("apple", "banana", "mango", "banana"));
        products.put("vegetables", Arrays.asList("carrot", "broccoli", "beet", "zucchini"));
        products.put("drinks", Arrays.asList("coffee", "tea", "mango", "iced", "tea"));
        Map<String, List<String>> result = topNPerCategory(products);
        System.out.println(result);
    }

    static Comparator<String> byLengthDescThenAlpha = Comparator.comparingInt(String::length).reversed().thenComparing(String::compareToIgnoreCase);

    private static Map<String, List<String>> topNPerCategory(Map<String, List<String>> products) {
        return products.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue()
                .stream().map(String::trim).distinct().sorted(byLengthDescThenAlpha).limit(2).collect(Collectors.toList())));
    }
}
