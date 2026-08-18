package top100dsa.revision;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 8/17/2026
 */
public class ReverseArrayJava8 {
    static void main() {
        int[] number = {1, 2, 3, 4, 5};
        System.out.println("original number: " + Arrays.toString(number));
        int[] result = reverse(number);
        System.out.println("reversed number: " + Arrays.toString(result));
    }

    private static int[] reverse(int[] number) {
        return IntStream.range(0, number.length).map(i -> number[number.length - i - 1]).toArray();
    }
}
