package array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 1/30/2026
 */
public class TwoSumIndices {
    public static void main(String[] args) {
        int[] arr = {2, 7, 7, 15};
        int target = 9;
        int[] result = twoSum(arr, target);
        System.out.println(result[0] + " " + result[1]);
    }

    private static int[] twoSum(int[] number1, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < number1.length; i++) {
            int needed = target - number1[i];
            if (map.containsKey(needed)) {
                return new int[]{map.get(needed), i};
            }
            map.put(number1[i], i);
        }
        return new int[]{-1, -1};
    }
}
