package string.revision;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 7/3/2026
 */
public class ReverseWords {
    static void main() {
//        String s = "..i.like.this.program.very.much...";
        String s = "..home.....";
        String input = "I love Java";
        String result1 = reverseWordApproach1(s);
        System.out.println("Reversed String approach1: " + result1);
        String result2 = reverseWordApproach2(input);
        System.out.println("Reversed String approach2: " + result2);
    }

    private static String reverseWordApproach3(String s) {
        return null;
    }

    private static String reverseWordApproach2(String input) {
        String[] split = input.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = split.length - 1; i >= 0; i--) {
            sb.append(split[i]).append(" ");
        }
        return sb.toString().trim();
    }

    private static String reverseWordApproach1(String s) {
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
