package java8concept;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 9/16/2025
 */
public class PartitionExample {
    public static void main(String[] args) {
        List<List<Integer>> numbers = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(2, 3, 4), Arrays.asList(5, 6, 7));
        Map<Boolean, List<Integer>> result = evenOdd(numbers);
        resultPrint(result);
    }

    private static void resultPrint(Map<Boolean, List<Integer>> result) {
        result.entrySet().forEach(entry -> {
            String key = entry.getKey() ? "even" : "odd";
            System.out.println(key + " number : " + entry.getValue());
        });
    }

    private static Map<Boolean, List<Integer>> evenOdd(List<List<Integer>> numbers) {
        return numbers.stream().flatMap(List::stream).collect(Collectors.partitioningBy(n -> n % 2 == 0));
    }
}
