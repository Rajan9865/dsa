package java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 10/3/2025
 */
public class CommonElements {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8, 9);

        List<Integer> resultNaive = commonElementsNaive(list1, list2);
        List<Integer> resultEfficient = commonElementsEfficient(list1, list2);

        System.out.println("Naive approach (list.contains): " + resultNaive);
        System.out.println("Efficient approach (HashSet): " + resultEfficient);
    }

    // Approach 1: Simple but O(n^2)
    private static List<Integer> commonElementsNaive(List<Integer> list1, List<Integer> list2) {
        return list1.stream()
                .filter(list2::contains)
                .distinct()
                .collect(Collectors.toList());
    }

    // Approach 2: Efficient using HashSet lookup
    private static List<Integer> commonElementsEfficient(List<Integer> list1, List<Integer> list2) {
        Set<Integer> set2 = new HashSet<>(list2);
        return list1.stream()
                .filter(set2::contains)
                .distinct()
                .collect(Collectors.toList());
    }
}