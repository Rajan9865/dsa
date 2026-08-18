package top100dsa;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 8/5/2026
 */
public class ReverseStringBruteForce {
    static void main() {
        String str = "java backend";
        System.out.println("original string: " + str);
        System.out.println("reverse string " + reverse(str));
    }

    private static String reverse(String str) {
        StringBuilder sb = new StringBuilder();
        char[] chars = str.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            sb.append(chars[i]);
        }
        return sb.toString();
    }
}
