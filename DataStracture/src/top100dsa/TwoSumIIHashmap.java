package top100dsa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 9/14/2026
 */
public class TwoSumIIHashmap {
    static void main() {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSumUsinghashmap(numbers, target);
        int[] result1 = twoSumusingTwoPointer(numbers, target);
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(result1));
    }

    private static int[] twoSumusingTwoPointer(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
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

    private static int[] twoSumUsinghashmap(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement) + 1, i + 1};
            }
            map.put(numbers[i], i);
        }
        return new int[]{-1, -1};
    }
}
