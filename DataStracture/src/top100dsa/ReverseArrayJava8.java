package top100dsa;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 8/5/2026
 */
public class ReverseArrayJava8 {
    static void main() {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original Array: " + Arrays.toString(arr));
        int[] result = reverseArray(arr);
        System.out.println("Reversed Array: " + Arrays.toString(result));
    }

    private static int[] reverseArray(int[] arr) {
        return IntStream.range(0, arr.length).map(i -> arr[arr.length - 1 - i]).toArray();
    }
}
