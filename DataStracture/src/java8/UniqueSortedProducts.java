package java8;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 9/18/2025
 */
public class UniqueSortedProducts {
    public static void main(String[] args) {
        Map<String, List<String>> products = new HashMap<>();
        products.put("fruits", Arrays.asList("apple", "banana", "mango"));
        products.put("vegetables", Arrays.asList("carrot", "broccoli", "banana"));
        products.put("drinks", Arrays.asList("coffee", "tea", "mango"));
        List<String> result = uniqueSortedProducts(products);
        printResult(result);
    }

    private static void printResult(List<String> result) {
        result.forEach(s -> System.out.print(s + " "));
    }

    private static List<String> uniqueSortedProducts(Map<String, List<String>> products) {
        return products.values().stream().flatMap(List::stream).filter(p -> p.length() > 5)
                .distinct().sorted().collect(Collectors.toList());

//        return products.values().stream().flatMap(List::stream).filter(p -> p.length() > 5)
//                .distinct().sorted((s1, s2) -> s2.compareToIgnoreCase(s1)).collect(Collectors.toList());

//        return products.values().stream().flatMap(List::stream).filter(p -> p.length() > 5)
//                .distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }
}
