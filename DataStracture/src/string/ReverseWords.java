package string;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 2/11/2026
 */
public class ReverseWords {
    public static void main(String[] args) {
        String s = "..i.like.this.program.very.much...";
        String result = reverseWord(s);
        System.out.println("Reversed String: " + result);
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
