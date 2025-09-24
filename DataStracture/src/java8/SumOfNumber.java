package java8;

import java.util.Arrays;
import java.util.List;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 8/20/2025
 */
public class SumOfNumber {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5);
        int result = sumOfNumber(number);
        System.out.println("Sum of number is " + result);
    }

    private static int sumOfNumber(List<Integer> number) {
        return number.stream().reduce(1, (a, b) -> a + b);
//        return number.stream().reduce(1, Integer::sum);
        // Alternatively, you can use the sum() method directly:
        // return number.stream().mapToInt(Integer::intValue).sum();
    }
}
