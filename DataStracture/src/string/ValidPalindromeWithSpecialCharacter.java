package string;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 3/19/2026
 */
public class ValidPalindromeWithSpecialCharacter {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    private static boolean isPalindrome(String input) {
        int left = 0;
        int right = input.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(input.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(input.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(input.charAt(left)) != Character.toLowerCase(input.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
