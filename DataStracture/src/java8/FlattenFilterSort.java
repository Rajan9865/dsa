package java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        products.put("vegetables", Arrays.asList("carrot", "Broccoli", "banana"));
        products.put("drinks", Arrays.asList("coffee", "Tea", "mango", "rajani", "nishani"));
        flattenFilterSort(products);
//        printresult()
    }

    private static void flattenFilterSort(Map<String, List<String>> products) {
        return
    }
}
