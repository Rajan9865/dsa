package java8;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author Rajan kumar
 */
public class MaxMinNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(15, 42, 7, 89, 23, 56);
        // List<Integer> numbers = Arrays.asList(); // test with empty list

        Optional<Integer> min = minNumber(numbers);
        Optional<Integer> max = maxNumber(numbers);

        int minPrimitive = minNumberPrimitive(numbers);
        int maxPrimitive = maxNumberPrimitive(numbers);

        Optional<Integer> minCollector = minNumberCollector(numbers);
        Optional<Integer> maxCollector = maxNumberCollector(numbers);

        System.out.println("Using stream.min: " + min.orElse(null));
        System.out.println("Using stream.max: " + max.orElse(null));

        System.out.println("Using mapToInt min: " + minPrimitive);
        System.out.println("Using mapToInt max: " + maxPrimitive);

        System.out.println("Using Collectors.minBy: " + minCollector.orElse(null));
        System.out.println("Using Collectors.maxBy: " + maxCollector.orElse(null));
    }

    // Approach 1: Stream min/max directly
    private static Optional<Integer> minNumber(List<Integer> numbers) {
        return numbers.stream().min(Integer::compareTo);
    }

    private static Optional<Integer> maxNumber(List<Integer> numbers) {
        return numbers.stream().max(Integer::compareTo);
    }

    // Approach 2: Using primitive streams
    private static int minNumberPrimitive(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(Integer::intValue)
                .min()
                .orElseThrow(NoSuchElementException::new);
    }

    private static int maxNumberPrimitive(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElseThrow(NoSuchElementException::new);
    }

    // Approach 3: Using Collectors
    private static Optional<Integer> minNumberCollector(List<Integer> numbers) {
        return numbers.stream().collect(Collectors.minBy(Integer::compareTo));
    }

    private static Optional<Integer> maxNumberCollector(List<Integer> numbers) {
        return numbers.stream().collect(Collectors.maxBy(Integer::compareTo));
    }
}
