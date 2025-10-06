package java8;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 10/6/2025
 */
public class SumOfEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 15, 4, 25, 6, 35);

        int sumStream = sumOfEvenNumbers(numbers);
        int sumLoop = sumOfEvenNumbersTraditional(numbers);
        OptionalDouble avg = avgOfEvenNumbers(numbers);
        int product = productOfEvenNumbers(numbers);

        System.out.println("Sum (Streams)     : " + sumStream);
        avg.ifPresent(a -> System.out.println("Average (Streams) : " + a));
        System.out.println("Sum (Traditional) : " + sumLoop);
        System.out.println("Product (Streams) : " + product);
    }

    // Approach 1: Stream reduce with sum
    private static int sumOfEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .reduce(0, Integer::sum);
        // OR numbers.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
    }

    // Approach 2: Traditional for-loop
    private static int sumOfEvenNumbersTraditional(List<Integer> numbers) {
        int sum = 0;
        for (int n : numbers) {
            if (n % 2 == 0) sum += n;
        }
        return sum;
    }

    // Approach 3: Stream average
    private static OptionalDouble avgOfEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .average();
    }

    // Approach 4: Stream reduce for product
    private static int productOfEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .reduce(1, (a, b) -> a * b);
    }
}