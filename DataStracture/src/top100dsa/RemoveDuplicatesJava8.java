package top100dsa;

import java.util.Arrays;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 8/24/2026
 */
public class RemoveDuplicatesJava8 {
    static void main() {
        int[] number = {1, 3, 3, 2, 4, 5, 6, 5, 5, 7};
        System.out.println("original number: " + Arrays.toString(number));
        int[] result = removeDuplicates(number);
        System.out.println("result: " + Arrays.toString(result));
    }

    private static int[] removeDuplicates(int[] number) {
        return Arrays.stream(number).distinct().toArray();
    }
}
