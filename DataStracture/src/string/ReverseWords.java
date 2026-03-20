package string;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 2/11/2026
 */
public class ReverseWords {
    public static void main(String[] args) {
        String s = "..i.like.this.program.very.much...";
        String input = "I love Java";
        String result = reverseWord(s);
        String result1 = reverseWord1(input);

        System.out.println("Reversed String: " + result1);
    }

    private static String reverseWord1(String input) {
        String[] split = input.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = split.length - 1; i >= 0; i--) {
            sb.append(split[i]).append(" ");
        }
        return sb.toString().trim();
    }

    private static String reverseWord(String s) {
        String[] split = s.split("\\.");
        StringBuilder sb = new StringBuilder();
        for (int i = split.length - 1; i >= 0; i--) {
            if (!split[i].isEmpty()) {
                sb.append(split[i]).append(".");
            }
        }
        if (split.length > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }
}
