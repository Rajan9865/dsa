package top100dsa;

import java.util.Locale;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 8/24/2026
 */
public class ValidPalindromeJava8 {
    static void main() {
        String str1 = "A man, a plan, a canal: Panama";
        String str2 = "race a car";

        System.out.println(str1 + " -> " + isPalindrome(str1));
        System.out.println(str2 + " -> " + isPalindrome(str2));
    }

    private static boolean isPalindrome(String str) {
        String cleaned = str.replaceAll("[^A-Za-z0-9]", "").toLowerCase(Locale.ROOT);
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }
}
