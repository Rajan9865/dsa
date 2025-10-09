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
public class VowelCount2 {
    public static void main(String[] args) {
        String input = "Beautiful Java Programming";

        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        Map<Boolean, Map<Character, Long>> result = vowelAndConsonantCount(input, vowels);

        System.out.println("Vowel count: " + result.get(true));
        System.out.println("Consonant count: " + result.get(false));
    }

    // Partition letters into vowels (true) and consonants (false),
    // then count each character's frequency in both groups
    private static Map<Boolean, Map<Character, Long>> vowelAndConsonantCount(String input, Set<Character> vowels) {
        return input.toLowerCase()
                .chars()
                .mapToObj(c -> (char) c)
                .filter(Character::isLetter)
                .collect(Collectors.partitioningBy(
                        vowels::contains, // partition condition (true=vowel, false=consonant)
                        Collectors.groupingBy(Function.identity(), Collectors.counting())
                ));
    }
}
