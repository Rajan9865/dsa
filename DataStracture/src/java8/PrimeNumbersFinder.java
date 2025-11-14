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
