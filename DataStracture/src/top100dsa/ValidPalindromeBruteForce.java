package top100dsa;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 8/24/2026
 */
public class ValidPalindromeBruteForce {
    static void main() {
//        String s = "A man, a plan, a canal: Panama";
        String s = "A man, a plan, a canal: Panama";
        System.out.println("oringal string " + s);
        System.out.println("is palindrome " + isPalindrome(s));
    }

    private static boolean isPalindrome(String name) {
        StringBuilder cleaned = new StringBuilder();
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                cleaned.append(Character.toLowerCase(ch));
            }
        }
        String orignal = cleaned.toString();
        String reversed = cleaned.reverse().toString();
        return orignal.equals(reversed);
    }
}
