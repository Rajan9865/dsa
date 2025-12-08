package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 12/4/2025
 */
public class FlattenList {
    public static void main(String[] args) {
        List<List<Integer>> number = Arrays.asList(Arrays.asList(9, 11, 10, 1, 2, 3),
                Arrays.asList(2, 3, 4, 5),
                Arrays.asList(4, 5, 6));
        List<Integer> result = removeDuplicateFromList(number);
        System.out.println(result);
    }

    private static List<Integer> removeDuplicateFromList(List<List<Integer>> number) {
        return number.stream().flatMap(List::stream)
                .distinct().sorted().collect(Collectors.toList());
    }
}
