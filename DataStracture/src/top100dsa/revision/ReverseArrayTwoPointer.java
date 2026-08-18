package top100dsa.revision;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 8/17/2026
 */
public class ReverseArrayTwoPointer {
    static void main() {
        int[] number = {1, 2, 3, 4};
//        System.out.println("Original Array: " + Arrays.toString(number));
//        System.out.println("reverse araya " + Arrays.toString(reverse(number)));
        int[] result = reverseArray(number);
        System.out.println("Reversed Array: " + Arrays.toString(result));
    }

    private static int[] reverseArray(int[] number) {
        return IntStream.range(0, number.length).map(n -> number[number.length - n - 1]).toArray();
    }

    private static int[] reverse(int[] number) {
        int start = 0;
        int end = number.length - 1;
        while (start < end) {
            int temp = number[start];
            number[start] = number[end];
            number[end] = temp;
            start++;
            end--;
        }
        return number;
    }
}
