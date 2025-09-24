package java8;


import java.util.*;

import static java.util.stream.Collectors.*;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 9/23/2025
 */
public class GroupByLength {
    public static void main(String[] args) {
        Map<String, List<String>> products = new HashMap<>();
        products.put("fruits", Arrays.asList("apple", "banana", "mango", "pear"));
        products.put("vegetables", Arrays.asList("carrot", "banana", "broccoli", "pea"));
        products.put("drinks", Arrays.asList("tea", "coffee", "mango", "apple"));
        Map<Integer, ArrayList<String>> result = grouped(products);
        printResult(result);
    }

    private static void printResult(Map<Integer, ArrayList<String>> result) {
        result.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));
    }

    private static Map<Integer, ArrayList<String>> grouped(Map<String, List<String>> products) {
//        return products.values().stream().flatMap(List::stream).map(String::trim)
//                .distinct().collect(groupingBy(String::length, collectingAndThen(
//                        toCollection(() -> new TreeSet<>(String.CASE_INSENSITIVE_ORDER)),
//                        set -> new ArrayList<>(set)
//                )));
    }
}
