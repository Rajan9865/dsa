package top100dsa;

import java.util.Arrays;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 9/8/2026
 */
public class TwoSumBruteForce {
    static void main() {
        int[] number = {2, 7, 11, 15};
        int target = 99;
        int[] result = twoSum(number, target);
        System.out.println("Result :" + Arrays.toString(result));
    }

    private static int[] twoSum(int[] number, int target) {
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] + number[j] == target) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
