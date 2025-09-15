package java8concept;

import java.util.Arrays;
import java.util.List;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 9/15/2025
 */
public class ListIntegerBasedExample {
    public static void main(String[] args) {
        List<List<Integer>> number = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(2, 3, 4), Arrays.asList(5, 6, 7));
        List<Number> flatList = flatList(number);
        resultPrint(flatList);
    }

    private static void resultPrint(List<Number> flatList) {
    }

    private static List<Number> flatList(List<List<Integer>> number) {
    }
}
