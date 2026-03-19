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
        System.out.println(results);
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
