package top100dsa;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 9/8/2026
 */
public class TwoSumJava8 {
    static void main() {
        int[] number = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(number, target);
        System.out.println("Result :" + Arrays.toString(result));
    }

    private static int[] twoSum(int[] number, int target) {
        return IntStream.range(0, number.length).boxed()
                .flatMap(i -> IntStream.range(i + 1, number.length)
                        .filter(j -> number[i] + number[j] == target)
                        .mapToObj(j -> new int[]{i + 1, j + 1}))
                .findFirst()
                .orElse(new int[]{-1, -1});
    }
}
