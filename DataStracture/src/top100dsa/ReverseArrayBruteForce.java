package top100dsa;

import java.util.Arrays;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 8/5/2026
 */
public class ReverseArrayBruteForce {
    static void main() {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println("Original Array: " + Arrays.toString(arr));
        reverseArray(arr);
    }

    private static void reverseArray(int[] arr) {
        int[] result = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            result[j++] = arr[i];
        }
        System.out.println(STR."Reversed Array: \{Arrays.toString(result)}");
    }
}
