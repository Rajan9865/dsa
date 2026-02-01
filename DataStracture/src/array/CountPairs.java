package array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 1/30/2026
 */
public class CountPairs {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 1};
        int target = 6;
        int result = countPairs(arr, target);
        System.out.println(result);
    }

    private static int countPairs(int[] number, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int num : number) {
            int needed = target - num;
            if (map.containsKey(needed)) {
                count += map.get(needed);
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return count;
    }
}
