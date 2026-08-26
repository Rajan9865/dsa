package top100dsa;

import java.util.Arrays;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 8/26/2026
 */
public class RemoveElementBruteForce {
    static void main() {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        System.out.println("original array: " + Arrays.toString(nums));
        int[] result = removeElement(nums, val);
        System.out.println("after remove: " + Arrays.toString(result));
    }

    private static int[] removeElement(int[] nums, int val) {
        int[] length = new int[nums.length];
        int index = 0;
        for (int num : nums) {
            if (num != val) {
                length[index] = num;
                index++;
            }
        }
        return Arrays.copyOf(length, index);
    }
}
