package top100dsa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 9/8/2026
 */
public class TwoSumHashMap {
    static void main() {
        int[] number = {2, 7, 11, 15};
        int target = 90;
        int[] result = twoSum(number, target);
        System.out.println("Result :" + Arrays.toString(result));
    }

    private static int[] twoSum(int[] number, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < number.length; i++) {
            int complement = target - number[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement) + 1, i + 1};
            }
            map.put(number[i], i);
        }
        return new int[]{-1, -1};
    }
}
