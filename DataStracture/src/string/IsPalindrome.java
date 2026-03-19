package string;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 3/19/2026
 */
public class IsPalindrome {
    public static void main(String[] args) {
        String input = "abba";
        boolean results = isPalindrome(input);
        boolean results1 = isPalindromeApproach1(input);
        boolean results2 = isPalindromeApproach2(input);
        System.out.println(results2);
    }

    private static boolean isPalindromeApproach2(String input) {
        return input.equals(new StringBuilder(input).reverse().toString());
    }

    private static boolean isPalindromeApproach1(String input) {
        int start = 0;
        int end = input.length() - 1;
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    private static boolean isPalindrome(String input) {
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
