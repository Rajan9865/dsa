package top100dsa;

import java.util.Arrays;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 8/24/2026
 */
public class RemoveDuplicatesTwoPointer {
    static void main() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println("orignal array :" + Arrays.toString(nums));
        System.out.println("original number: " + Arrays.toString(nums));
        int[] result = removeDuplicates(nums);
        System.out.println("result: " + Arrays.toString(result));
    }

    private static int[] removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0)
            return nums;
        int slow = 0;
        for (int i = 1; i < nums.length; i++) {

        }
        return null;
    }
}
