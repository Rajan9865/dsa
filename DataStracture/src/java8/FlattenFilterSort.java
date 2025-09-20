package java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 9/19/2025
 */
public class FlattenFilterSort {
    public static void main(String[] args) {
        Map<String, List<String>> products = new HashMap<>();
        products.put("fruits", Arrays.asList("Apple", "banana", "Mango"));
        products.put("vegetables", Arrays.asList("carrot", "Broccooli", "banana"));
        products.put("drinks", Arrays.asList("coffee", "Tea", "mango", "rajani", "nishani"));
        List<String> result = flattenFilterSort(products);
        printresult(result);
    }

    private static void printresult(List<String> result) {
        result.forEach(p -> System.out.print(p + " "));
    }

    private static List<String> flattenFilterSort(Map<String, List<String>> products) {
        return products.values().stream().flatMap(List::stream).filter(p -> p.contains("o"))
                .distinct().sorted().collect(Collectors.toList());
    }
}
