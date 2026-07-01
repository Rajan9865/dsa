package stringrevision;


/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 7/1/2026
 */
public class IsPalindrome {
    static void main() {
        String input1 = "abba";
        boolean result1 = isPalindromeApproach1(input1);
        System.out.println(" approach first " + result1);
        boolean result2 = isPalindromeApproach2(input1);
        System.out.println(" approach 2nd " + result2);
        boolean result3 = isPalindromeApproach3(input1);
    }

    private static boolean isPalindromeApproach3(String input1) {
        return false;
    }

    private static boolean isPalindromeApproach2(String input) {
        int start = 0;
        int end = input.length() - 1;
        while (start < end) {
//            if (input.charAt(start++) != input.charAt(end--))
//                return false;
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    private static boolean isPalindromeApproach1(String input) {
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
