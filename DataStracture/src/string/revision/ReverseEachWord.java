package string.revision;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 7/8/2026
 */
public class ReverseEachWord {
    static void main() {
        String input = "I Love java";
        String result = reverseEachWord(input);
        System.out.println("1st approach Reversed Each word is: " + result);
        String result1 = reverseEachWordApproach2nd(input);
        System.out.println("2nd Approach Reversed Each word is: " + result);

    }

    private static String reverseEachWordApproach2nd(String input) {
        String[] split = input.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : split) {
            sb.append(word).append(" ");
        }
        return sb.toString();
    }

    private static String reverseEachWord(String input) {
        String[] split = input.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = split.length - 1; i >= 0; i--) {
            sb.append(split[i]).append(" ");
        }
        return sb.toString();
    }
}
