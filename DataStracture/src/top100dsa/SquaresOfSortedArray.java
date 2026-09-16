package top100dsa;

import java.util.Arrays;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 9/14/2026
 */
public class SquaresOfSortedArray {
    static void main() {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] result = bruteForce(nums);
        System.out.println(Arrays.toString(result));
    }

    private static int[] bruteForce(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
