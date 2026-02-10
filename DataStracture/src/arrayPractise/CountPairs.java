package arrayPractise;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 2/10/2026
 */
public class CountPairs {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        int target = 6;
        int result = countPairs(num, target);
        System.out.println(result);
    }

    private static int countPairs(int[] num, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int number : num) {
            int sum = target - number;
            if (map.containsKey(sum)) {
                count += map.get(sum);
            }
            map.put(number, map.getOrDefault(number, 0) + 1);
        }
        return count;
    }
}
