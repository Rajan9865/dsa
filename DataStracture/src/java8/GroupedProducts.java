package java8;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 9/19/2025
 */
public class GroupedProducts {
    public static void main(String[] args) {
        Map<String, List<String>> products = new HashMap<>();
        products.put("fruits", Arrays.asList("Apple", "banana", "Mango"));
        products.put("vegetables", Arrays.asList("carrot", "Broccoli", "banana"));
        products.put("drinks", Arrays.asList("coffee", "Tea", "mango", "rajani", "nishani"));

        Map<Character, List<String>> result = groupedProducts(products);
        printResult(result);
    }

    private static void printResult(Map<Character, List<String>> result) {
        result.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(k -> System.out.println(k.getKey() + " ->" + k.getValue()));
    }

    private static Map<Character, List<String>> groupedProducts(Map<String, List<String>> products) {
        return products.values().stream().flatMap(List::stream).filter(p -> p.length() > 5)
                .collect(Collectors.groupingBy((
                        p -> Character.toLowerCase(p.charAt(0))
                ), Collectors.collectingAndThen(Collectors.toCollection(() -> new TreeSet<>(String.CASE_INSENSITIVE_ORDER)), ts -> new ArrayList<>(ts))));
    }
}
