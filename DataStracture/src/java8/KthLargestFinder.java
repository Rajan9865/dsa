package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 9/18/2025
 */
public class KthLargestFinder {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(15, 6, 20, 8, 25, 12);
        Integer result = kthLargest(numbers);
        System.out.println(result);
    }

    private static Integer kthLargest(List<Integer> numbers) {
        int k = 3;
//        return numbers.stream().sorted(Comparator.reverseOrder()).skip(k - 1).findFirst().orElse(null);
        return numbers.stream().sorted((s1, s2) -> s2.compareTo(s1)).skip(k - 1).findFirst().orElse(null);
    }
}
