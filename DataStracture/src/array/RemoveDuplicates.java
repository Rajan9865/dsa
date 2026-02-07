package array;

import java.util.Arrays;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 2/6/2026
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4};
        int[] result = removeDuplicates(arr);
        System.out.println("Array after removing duplicates:");
        System.out.println(Arrays.toString(result));
    }

    private static int[] removeDuplicates(int[] number) {
        if (number == null || number.length == 0)
            return number;
        int index = 0;
        for (int i = 1; i < number.length; i++) {
            if (number[i] != number[index]) {
                index++;
                number[index] = number[i];
            }

        }
        int[] result = new int[index + 1];
        for (int k = 0; k <= index; k++) {
            result[k] = number[k];
        }

        return result;
    }
}
