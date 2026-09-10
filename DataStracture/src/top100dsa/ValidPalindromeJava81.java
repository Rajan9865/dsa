package top100dsa;

import java.util.stream.Collectors;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 9/9/2026
 */
public class ValidPalindromeJava81 {
    static void main() {
        String s = "A man, a plan, a canal: Panama";
        boolean result = isPalindrome(s);
        System.out.println("Input: " + s);
        System.out.println("Is Palindrome: " + result);
    }

    private static boolean isPalindrome(String s) {
        String cleaned = s.chars().filter(Character::isLetterOrDigit)
                .mapToObj(c -> String.valueOf(Character.toLowerCase((char) c)))
                .collect(Collectors.joining());
//        String reversed = new StringBuilder(cleaned).reverse().toString();
//        return cleaned.equals(reversed);
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }
}
