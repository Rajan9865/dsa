package string;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 3/20/2026
 */
public class ReversePartialString {
    public static void main(String[] args) {
        String input = "abcdef";
        int k = 3;
        String result = reverseFirstK(input, k);
        System.out.println(result);
    }

    private static String reverseFirstK(String input, int k) {
        if (input == null || input.length() == 0 || k <= 1) {
            return input;
        }
        char[] chars = input.toCharArray();
        int left = 0;
        int right = Math.min(chars.length - 1, k - 1);
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return String.valueOf(chars);
    }
}
