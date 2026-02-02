package array;

import java.util.Arrays;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 2/2/2026
 */
public class RemoveTwoGreatest {
    public static void main(String[] args) {
        int[] arr = {2, 8, 7, 7, 1, 5};
        int[] result = removeTwoGreatest(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] removeTwoGreatest(int[] num) {
        if (num == null || num.length <= 2) {
            return new int[0];
        }
        return Arrays.stream(num).distinct()
                .sorted().limit(num.length - 2).toArray();
    }
}
