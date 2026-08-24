package top100dsa;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 8/19/2026
 */
public class ReverseStringJava8 {
    static void main() {
        String str = "abcdefg";
        System.out.println(STR."Original String: \{str}");
        System.out.println(STR."reverse string \{reverse(str)}");
    }

    private static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
