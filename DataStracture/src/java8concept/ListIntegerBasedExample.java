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
        List<Integer> flatList = flatList(number);
        partation(number);
        resultPrint(flatList);
    }

    private static Map<Boolean, List<List<Integer>>> partation(List<List<Integer>> numbers) {
//        return flatList.stream().flatMap(List::stream).collect(Collectors.partitioningBy(num -> num % 2 == 0));
        return numbers.stream()
                .flatMap(List::stream) // flatten first
                .collect(Collectors.partitioningBy(num -> num % 2 == 0));
    }

    private static void resultPrint(List<Integer> numbers) {
        numbers.forEach(s -> System.out.print(" " + s));
    }

    private static List<Integer> flatList(List<List<Integer>> number) {
        return number.stream().flatMap(List::stream).collect(Collectors.toList());
    }
}
