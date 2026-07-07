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
//        System.out.println("1st approach " + findSecondLargestNumber1st(num));
        System.out.println("2nd approach " + findSecondLargestNumber2nd(num));
    }

    private static int findSecondLargestNumber2nd(int[] num) {
        if (num == null || num.length < 2) {
            return -1;
        }
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        for (int numbers : num) {
            if (numbers > largest) {
                secondlargest = largest;
                largest = numbers;
            } else if (numbers < largest && numbers > secondlargest) {
                secondlargest = numbers;
            }
        }
        return secondlargest;
    }

    private static int findSecondLargestNumber1st(int[] num) {
        return Arrays.stream(num).distinct().boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst()
                .orElse(-1);
    }
}
