package top100dsa;

import java.util.Arrays;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 9/23/2026
 */
public class SortColorsBruiteForce {
    static void main() {
        int[] nums = {1, 0, 2, 1, 0, 1, 2};
//        bruteForce(nums);
        java8Approach(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void java8Approach(int[] number) {
        long zeros = Arrays.stream(number).filter(x -> x == 0).count();
        long ones = Arrays.stream(number).filter(x -> x == 1).count();
        long twos = Arrays.stream(number).filter(x -> x == 2).count();
        int index = 0;
        for (int i = 0; i < zeros; i++) {
            number[index++] = 0;
        }
        for (int i = 0; i < ones; i++) {
            number[index++] = 1;
        }
        for (int i = 0; i < twos; i++) {
            number[index++] = 2;
        }
    }

    private static void bruteForce(int[] number) {
        Arrays.sort(number);
    }
}
