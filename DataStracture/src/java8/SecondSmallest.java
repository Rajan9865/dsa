package java8;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 10/7/2025
 */
public class SecondSmallest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(8, 3, 10, 1, 6, 3, 1);

        // Approach A: Stream (readable, O(n log n) due to sort)
        Optional<Integer> secondBySort = secondSmallestBySort(numbers);

        // Approach B: Collections trick (O(n) average for min + removals on small lists)
        Optional<Integer> secondByCollections = secondSmallestByCollections(numbers);

        // Approach C: Traditional single-pass O(n) (best for large input)
        secondSmallestTraditional(numbers);

        // Print stream results
        secondBySort.ifPresent(v -> System.out.println("Second smallest (sort): " + v));
        secondByCollections.ifPresent(v -> System.out.println("Second smallest (collections): " + v));
    }

    // Approach A — Stream: distinct + sort + skip
    private static Optional<Integer> secondSmallestBySort(List<Integer> numbers) {
        return numbers.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst(); // O(n log n)
    }

    // Approach B — Collections-based: find min, remove, then find min again
    // Good when distinct count is small; still overall O(n) to find mins
    private static Optional<Integer> secondSmallestByCollections(List<Integer> numbers) {
        List<Integer> unique = numbers.stream().distinct().collect(Collectors.toList());
        if (unique.size() < 2) return Optional.empty();
        Integer min = Collections.min(unique);
        unique.remove(min); // removes first occurrence of min
        return unique.isEmpty() ? Optional.empty() : Optional.of(Collections.min(unique));
    }

    // Approach C — Traditional single-pass O(n), handles duplicates properly
    private static void secondSmallestTraditional(List<Integer> numbers) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : numbers) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num > smallest && num < secondSmallest) {
                secondSmallest = num;
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("No second smallest element (all elements may be equal or only one unique).");
        } else {
            System.out.println("Second smallest (traditional): " + secondSmallest);
        }
    }
}
