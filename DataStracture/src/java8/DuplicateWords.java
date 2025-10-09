package java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Rajan Kumar
 * @version 1.0
 * DSA
 * @since 10/8/2025
 */
public class DuplicateWords {
    public static void main(String[] args) {
        String sentence = "Java is great and Java is powerful because Java is platform independent";

        // Count frequency of all words
        Map<String, Long> wordFrequency = countWordFrequency(sentence);

        // Extract only duplicate words (occurrences > 1)
        Map<String, Long> duplicates = findDuplicates(wordFrequency);
        findDuplicatesReverse(wordFrequency);

        // Print results
        System.out.println("All word counts: " + wordFrequency);
        System.out.println("Duplicate words: " + duplicates);
    }

    private static void findDuplicatesReverse(Map<String, Long> wordFrequency) {
        wordFrequency.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .forEach(System.out::println);
    }

    // Step 1: Count frequency of each word
    private static Map<String, Long> countWordFrequency(String sentence) {
        return Arrays.stream(sentence.toLowerCase().split("\\s+"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    // Step 2: Extract words that occur more than once
    private static Map<String, Long> findDuplicates(Map<String, Long> wordFrequency) {
        return wordFrequency.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}
