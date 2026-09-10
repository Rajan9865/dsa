package top100dsa;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 9/9/2026
 */
public class ValidPalindromeTwoPointer1 {
    static void main() {
        String s = "A man, a plan, a canal: Panama";
        boolean result = isPalindrome(s);
        System.out.println("Input: " + s);
        System.out.println("Is Palindrome: " + result);
        int cpu = Runtime.getRuntime().availableProcessors();
        int poolSize = Math.min(8, cpu);
        System.out.println(cpu);
    }

    private static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
