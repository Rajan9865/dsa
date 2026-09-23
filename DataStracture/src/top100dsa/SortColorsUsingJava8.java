package top100dsa;

import java.util.Arrays;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 9/23/2026
 */
public class SortColorsUsingJava8 {
    static void main() {
        int[] numbers = {1, 2, 0, 1, 0, 2, 0};
        sortColorUsingJava8(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    private static void sortColorUsingJava8(int[] numbers) {
        long zeros = Arrays.stream(numbers).filter(x -> x == 0).count();
        long twos = Arrays.stream(numbers).filter(x -> x == 2).count();
        long ones = Arrays.stream(numbers).filter(x -> x == 1).count();
        int index = 0;
        for (int i = 0; i < zeros; i++) {
            numbers[index++] = 0;
        }
        for (int i = 0; i < twos; i++) {
            numbers[index++] = 2;
        }
        for (int i = 0; i < ones; i++) {
            numbers[index++] = 1;
        }
    }
}
