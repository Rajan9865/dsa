package top100dsa;

import java.util.Arrays;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 9/14/2026
 */
public class SquaresOfSortedArrayUsingJava8 {
    static void main() {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] result = bruteForce(nums);
        System.out.println(Arrays.toString(result));
    }

    private static int[] bruteForce(int[] nums) {
        return Arrays.stream(nums).map(n -> n * n).sorted().toArray();
    }
}
