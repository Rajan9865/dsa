package top100dsa;

import java.util.Arrays;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 8/26/2026
 */
public class RemoveElementJava8 {
    static void main() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        System.out.println("before change: " + Arrays.toString(nums));
        int[] result = removeElement(nums, val);
        System.out.println("after change: " + Arrays.toString(result) + "remeainnig element: " + result.length);

    }

    private static int[] removeElement(int[] nums, int val) {
        return Arrays.stream(nums).filter(i -> i != val).toArray();
    }
}
