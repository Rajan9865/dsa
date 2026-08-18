package top100dsa.revision;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 8/17/2026
 */
public class ReverseStringBruteForce {
    static void main() {
        String str = "i am java backend developer";
        System.out.println("orignal string " + str);
        System.out.println("reverse string " + reverse(str));
    }

    private static String reverse(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] charArray = str.toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            stringBuilder.append(charArray[i]);
        }
        return stringBuilder.toString();
    }
}
