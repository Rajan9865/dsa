package top100dsa;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 8/24/2026
 */
public class ValidPalindromeTwoPointer {
    static void main() {
        String str1 = "A man,,,,, a plan, a canal: Panama";
        System.out.println("original input : " + str1);
        System.out.println("palindrome " + isPalindrome(str1));
    }

    private static boolean isPalindrome(String str1) {
        int left = 0;
        int right = str1.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(str1.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(str1.charAt(right))) {
                right--;
            }
            char leftChar = Character.toLowerCase(str1.charAt(left));
            char rightChar = Character.toLowerCase(str1.charAt(right));
            if (leftChar != rightChar) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
