package top100dsa;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 8/26/2026
 */
public class MoveZeroesJava8 {
    static void main() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println("original array: " + Arrays.toString(nums));
        int[] result = moveZeros(nums);
        System.out.println("after moving zeros: " + Arrays.toString(result));
    }

    private static int[] moveZeros(int[] nums) {
        int nonZeroesCount = (int) Arrays.stream(nums).filter(i -> i != 0).count();
        int[] nonZerosElement = Arrays.stream(nums).filter(i -> i != 0).toArray();
        int zeroesCount = nums.length - nonZeroesCount;
        int[] result = new int[zeroesCount];
        return IntStream.concat(Arrays.stream(nonZerosElement), Arrays.stream(result)).toArray();
    }
}
