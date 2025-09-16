package java8concept;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 9/15/2025
 */
public class ListIntegerBasedExample {
    public static void main(String[] args) {
        List<List<Integer>> number = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(2, 3, 4), Arrays.asList(5, 6, 7));
        List<List<Integer>> number1 = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(2, 3, 4), Arrays.asList(5, 6, 7));
        List<Integer> flatList = flatList(number);
        System.out.println("partation number ");
        Map<Boolean, List<Integer>> result = partation(number1);
        resultPrintMap(result);
        resultPrint(flatList);
    }

    private static void resultPrintMap(Map<Boolean, List<Integer>> result) {
        result.entrySet().stream().forEach(entry -> {
            String key = entry.getKey() ? "even" : "odd";
            System.out.println(key + " numbers : " + entry.getValue());
        });
    }

    private static Map<Boolean, List<Integer>> partation(List<List<Integer>> number1) {
        return number1.stream().flatMap(List::stream).collect(Collectors.partitioningBy(n -> n % 2 == 0));
    }


    private static void resultPrint(List<Integer> numbers) {
        numbers.forEach(s -> System.out.print(" " + s));
    }

    private static List<Integer> flatList(List<List<Integer>> number) {
        return number.stream().flatMap(List::stream).collect(Collectors.toList());
    }
}
