package revision;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 12/9/2025
 */
public class Duplicate1 {
    public static void main(String[] args) {
        int[] num = {1, 1, 2, 3, 4, 5, 5, 6, 7, 8, 8};
        Map<Integer, Long> result = duplicateElementCount1(num);
        List<Integer> result1 = duplicateElement(result);
        System.out.println(result1);
    }

    private static List<Integer> duplicateElement(Map<Integer, Long> result) {
        return result.entrySet().stream().filter(n -> n.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
    }

    private static Map<Integer, Long> duplicateElementCount1(int[] num) {
        return Arrays.stream(num).boxed().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
    }
}
