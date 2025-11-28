package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 11/12/2025
 */
public class PrimeNumbersFinder {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13);
        List<Integer> output = primeNumber(number);
        System.out.println(output);
        List<Integer> output1 = primeNumberBasic(number);
        List<Integer> output2 = primeNumberBasic1(number);
        System.out.println(output1);
        System.out.println(output2);
    }

    private static List<Integer> primeNumberBasic1(List<Integer> number) {
        return number.stream().filter(PrimeNumbersFinder::isOptimizePrimeNumber)
                .collect(Collectors.toList());
    }

    private static boolean isOptimizePrimeNumber(Integer number) {
        if (number < number) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static List<Integer> primeNumberBasic(List<Integer> number) {
        return number.stream().filter(PrimeNumbersFinder::isPrimeBasic)
                .collect(Collectors.toList());
    }

    private static boolean isPrimeBasic(Integer number) {
        if (number < 1) return false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static List<Integer> primeNumber(List<Integer> number) {
        return number.stream().filter(PrimeNumbersFinder::isprime)
                .collect(Collectors.toList());
    }

    private static boolean isprime(Integer number) {
        if (number < 1) return false;
        return IntStream.rangeClosed(2, (int) Math.sqrt(number)).noneMatch(i -> number % i == 0);
    }
}
