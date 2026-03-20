package string;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 3/19/2026
 */
public class ReverseString {
    public static void main(String[] args) {
        String inputString = "Hello World";
        String result = reverseString(inputString);
        System.out.println("Reversed String: " + result);
    }

    private static String reverseString(String input) {
        char[] chars = input.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        return String.valueOf(chars);
    }
}
