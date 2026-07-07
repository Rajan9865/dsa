package array.revision;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 7/6/2026
 */
public class SecondLargestElement {
    public static void main(String[] args) {
        int[] num = {1, 5, 7, 5, 9, 6};
        System.out.println("1st approach " + findSecondLargestNumber1st(num));
    }

    private static int findSecondLargestNumber1st(int[] num) {
        return Arrays.stream(num).boxed().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(-1);
    }
}
