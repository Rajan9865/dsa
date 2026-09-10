package top100dsa;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 9/9/2026
 */
public class ValidPalindromeBruteForce1 {
    static void main() {
        String s = "A man, a plan, a canal: Panama";
        boolean result = isPalindrome(s);
        System.out.println("Input: " + s);
        System.out.println("Is Palindrome: " + result);
    }

    private static boolean isPalindrome(String s) {
        StringBuilder cleaned = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }
        String cleanedString = cleaned.toString();
        String reversedString = cleaned.reverse().toString();
        return cleanedString.equals(reversedString);
    }
}
