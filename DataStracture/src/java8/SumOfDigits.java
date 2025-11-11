package java8;

import java.util.Arrays;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 11/11/2025
 */
public class SumOfDigits {
    public static void main(String[] args) {
        int number = 321;
        int sum1 = sumOfDigitNumber1(number);
        int sum2 = sumOfDigitNumber2(number);
        int sum3 = sumOfDigitNumber3(number);
        System.out.println(sum1);
    }

    private static int sumOfDigitNumber3(int number) {
        return Arrays.stream(String.valueOf(number).split(""))
                .mapToInt(Integer::parseInt)
                .sum();
    }

    private static int sumOfDigitNumber2(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    private static int sumOfDigitNumber1(int number) {
        return String.valueOf(number).chars().map(c -> c - '0').sum();
    }
}
