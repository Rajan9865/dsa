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
 * @since 9/19/2025
 */
public class CountLongProductsPerCategory {
    public static void main(String[] args) {
        Map<String, List<String>> products = new HashMap<>();
        products.put("fruits", Arrays.asList("apple", "banana", "mango", "banana"));
        products.put("vegetables", Arrays.asList("carrot", "broccoli", "banana"));
        products.put("drinks", Arrays.asList("coffee", "tea", "mango"));
        Map<String, Long> result = countLongProductsPerCategory(products);
        System.out.println(result);
    }

    private static Map<String, Long> countLongProductsPerCategory(Map<String, List<String>> products) {
        return products.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey,
                e -> e.getValue().stream()
                        .map(String::trim).distinct().filter(p -> p.length() > 5).count()));
    }
}
