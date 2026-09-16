package top100dsa;

import java.util.Arrays;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 9/14/2026
 */
public class SquaresOfSortedArrayUsingTwoPointer {
    static void main() {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] result = bruteForce(nums);
        System.out.println(Arrays.toString(result));
    }

    private static int[] bruteForce(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        int left = 0;
        int right = len - 1;
        int index = len - 1;
        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            if (leftSquare > rightSquare) {
                result[index] = leftSquare;
                left++;
            } else {
                result[index] = rightSquare;
                right--;
            }
            index--;
        }
        return result;
    }
}
