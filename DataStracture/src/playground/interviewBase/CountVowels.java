package playground.interviewBase;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 9/25/2026
 */
public class CountVowels {
    static void main() {
        String str = "programming";
//        Long result = countVowels(str);
        Long result = countVowels2ndApproach(str);
        System.out.println("countVowels :" + result);
    }

    private static Long countVowels2ndApproach(String str) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        return str.toLowerCase()
                .chars()
                .mapToObj(c -> (char) c)
                .filter(vowels::contains)
                .count();
    }

    private static long countVowels(String str) {
        return str.toLowerCase()
                .chars()
                .filter(ch -> "aeiou".indexOf(ch) != -1)
                .count();
    }
}
