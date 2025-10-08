package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 10/8/2025
 */
public class LongestAndShortestWord {
    public static void main(String[] args) {
        String sentence = "Java stream API makes coding powerful and concise";

        // Split, clean, and collect all words
        List<String> words = extractWords(sentence);

        // Find longest and shortest words
        Optional<String> longest = findLongest(words);
        Optional<String> shortest = findShortest(words);

        longest.ifPresent(p -> System.out.println("Longest word: " + p));
        shortest.ifPresent(p -> System.out.println("Shortest word: " + p));
    }

    // Extract clean words from sentence (removes punctuation, empty tokens)
    private static List<String> extractWords(String sentence) {
        return Arrays.stream(sentence.split("[^a-zA-Z]+")) // split by non-letters
                .filter(p -> !p.isEmpty())                 // skip empty strings
                .collect(Collectors.toList());
    }

    // Find the longest word using Stream.max + Comparator
    private static Optional<String> findLongest(List<String> words) {
        return words.stream()
                .max(Comparator.comparingInt(String::length));
    }

    // Find the shortest word using Stream.min + Comparator
    private static Optional<String> findShortest(List<String> words) {
        return words.stream()
                .min(Comparator.comparingInt(String::length));
    }
}
