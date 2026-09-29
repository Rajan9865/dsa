package playground.interviewBase;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 9/29/2026
 */
public class countConsonantsUsingJava8 {
    static void main() {
        String str = "programming";
        long result = countConstant(str);
//        long result = countConstantApproach2(str);
        System.out.println("The result is: " + result);
    }

    private static long countConstantApproach2(String str) {
        Set<Character> vowels = new HashSet<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        return str.toLowerCase()
                .chars()
                .mapToObj(c -> (char) c)
                .filter(Character::isLetter)
                .filter(c -> !vowels.contains(c))
                .count();
    }

    private static long countConstant(String str) {
        return str.toLowerCase()
                .chars()
                .filter(ch -> "aeiou".indexOf(ch) != -1)
                .count();
    }
}
