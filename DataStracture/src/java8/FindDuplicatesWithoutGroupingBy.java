package java8;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 10/5/2025
 */
public class FindDuplicatesWithoutGroupingBy {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 2, 3, 6, 3, 7);

        // Approach A: stream + maintain seen set (preserve first-seen order of duplicates)
        List<Integer> duplicatesFromSeen = findDuplicatesUsingSeenSet(numbers);
        System.out.println("Duplicates (using seen set + stream): " + duplicatesFromSeen);

        // Approach B: traditional loop (fast, memory-efficient)
        List<Integer> duplicatesTraditional = findDuplicatesWithoutStreams(numbers);
        System.out.println("Duplicates (traditional loop): " + duplicatesTraditional);

        // Approach C: stream + toMap (counting via merge function)
        List<Integer> duplicatesUsingToMap = findDuplicatesWithToMap(numbers);
        System.out.println("Duplicates (using toMap counting): " + duplicatesUsingToMap);
    }

    // Approach A: use a HashSet to detect duplicates while streaming
    private static List<Integer> findDuplicatesUsingSeenSet(List<Integer> numbers) {
        Set<Integer> seen = new HashSet<>();
        return numbers.stream()
                .filter(n -> !seen.add(n)) // add returns false for duplicates
                .distinct()                 // keep each duplicate once
                .collect(Collectors.toList());
    }

    // Approach B: classic loop approach (returns duplicates, order not guaranteed)
    private static List<Integer> findDuplicatesWithoutStreams(List<Integer> numbers) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new LinkedHashSet<>(); // preserves insertion order of duplicates
        for (Integer num : numbers) {
            if (!seen.add(num)) { // already present => duplicate
                duplicates.add(num);
            }
        }
        return new ArrayList<>(duplicates);
    }

    // Approach C: use toMap with merge function to count, then filter counts > 1
    private static List<Integer> findDuplicatesWithToMap(List<Integer> numbers) {
        return numbers.stream()
                .collect(Collectors.toMap(n -> n, n -> 1, Integer::sum)) // key -> count
                .entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}