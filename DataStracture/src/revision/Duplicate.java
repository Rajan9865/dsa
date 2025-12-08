package revision;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 12/5/2025
 * https://meet.google.com/hps-qxvq-wxc
 * Find Duplicate Number in an Array Input: [1,3,4,2,2] → Output: 2
 */
public class Duplicate {
    public static void main(String[] args) {
        int[] num = {1, 3, 4, 2, 2};
        Map<Integer, Long> countNumber = findDuplicate(num);
        System.out.println(countNumber);
        List<Integer> duplicatenumber = duplicateElement(countNumber);
        System.out.println(duplicatenumber);
    }

    private static List<Integer> duplicateElement(Map<Integer, Long> number) {
        return number.entrySet().stream().filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey).collect(Collectors.toList());
    }

    private static Map<Integer, Long> findDuplicate(int[] num) {
        return Arrays.stream(num).boxed().collect(Collectors.groupingBy(n -> n,
                Collectors.counting()));
    }
}

