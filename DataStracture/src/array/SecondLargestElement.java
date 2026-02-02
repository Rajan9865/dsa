package array;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 2/1/2026
 */
public class SecondLargestElement {
    public static void main(String[] args) {
        int[] num = {1, 5, 7, 5, 9, 6};
        System.out.println(findSecondLargest(num));
        System.out.println(findSecondLargestUsingStream(num));
        System.out.println(findSecondLargestUsingStream1(num));
    }

    private static int findSecondLargestUsingStream1(int[] num) {
        return Arrays.stream(num).distinct().sorted().limit(num.length - 1).findFirst().orElse(-1);
    }

    private static int findSecondLargestUsingStream(int[] num) {
        return Arrays.stream(num).distinct().boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst()
                .orElse(-1);
    }

    private static int findSecondLargest(int[] num) {
        if (num == null || num.length < 2)
            return -1;
        int largest = -1;
        int secondLargest = -1;
        for (int number : num) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number < largest && number > secondLargest) {
                secondLargest = number;
            }
        }
        return secondLargest;
    }
}
