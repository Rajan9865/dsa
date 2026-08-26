package top100dsa;

import java.util.Arrays;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 8/26/2026
 */
public class MoveZeroesBruteForce {
    static void main() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println("original array: " + Arrays.toString(nums));
        moveZeros(nums);
        System.out.println("after moving zeros: " + Arrays.toString(nums));
    }

    private static void moveZeros(int[] nums) {
        int[] result = new int[nums.length];
        int index = 0;
        for (int number : nums) {
            if (number != 0) {
                result[index++] = number;
            }
        }
        for (int i = 0; i < result.length; i++) {
            nums[i] = result[i];
        }
    }
}
