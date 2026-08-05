package top100dsa;

import java.util.Arrays;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 8/5/2026
 */
public class ReverseArrayTwoPointer {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(STR."Original Array: \{Arrays.toString(arr)}");
        reverseArray(arr);
        System.out.println("reverse array: " + Arrays.toString(arr));
    }

    private static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
