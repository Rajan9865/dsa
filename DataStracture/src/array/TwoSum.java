package array;

import java.util.HashSet;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 1/30/2026
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] arr1 = {0, -1, 2, -3, 1};
        int target1 = -7;
        boolean result = hasPairWithSum(arr1, target1);
        System.out.println(result);
    }

    private static boolean hasPairWithSum(int[] number, int target) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : number) {
            int requiredSum = target - num;
            if (set.contains(requiredSum)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
