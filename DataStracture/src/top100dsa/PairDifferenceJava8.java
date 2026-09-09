package top100dsa;

import java.util.stream.IntStream;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 9/8/2026
 */
public class PairDifferenceJava8 {
    static void main() {
        int[] number = {1, 3, 5, 8, 10};
        int target = 2;
        boolean result = hashPairWithDifference(number, target);
        System.out.println("Target Difference: " + target);
        System.out.println("exist pair : " + result);
    }

    private static boolean hashPairWithDifference(int[] number, int target) {
        return IntStream.range(0, number.length)
                .anyMatch(i -> IntStream.range(i, number.length)
                        .anyMatch(j -> number[j] - number[i] == target));
    }
}
