package top100dsa;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 9/8/2026
 */
public class MergeSortedArraysJava8 {
    static void main() {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        int[] result = merge(arr1, arr2);
        System.out.println("array 1" + Arrays.toString(arr1));
        System.out.println("array 2" + Arrays.toString(arr2));
        System.out.println("result" + Arrays.toString(result));
    }

    private static int[] merge(int[] arr1, int[] arr2) {
        return IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().toArray();
    }
}
