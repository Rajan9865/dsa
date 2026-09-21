package top100dsa;

import java.util.Arrays;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 9/14/2026
 */
public class TwoSumII {
    static void main() {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] result = bruteForce(numbers, target);
        System.out.println(Arrays.toString(result));
    }

    private static int[] bruteForce(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
