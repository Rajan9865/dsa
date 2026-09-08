package top100dsa;

import java.util.Arrays;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 9/8/2026
 */
public class TwoSumTwoPointer {
    static void main() {
        int[] number = {2, 7, 11, 15};
        int target = 91;
        int[] result = twoSum(number, target);
        System.out.println("Result :" + Arrays.toString(result));
    }

    private static int[] twoSum(int[] number, int target) {
        int left = 0;
        int right = number.length - 1;
        while (left < right) {
            int sum = number[left] + number[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }
}
