package string;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 2/11/2026
 */
public class StringRotation {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cdab";
        System.out.println(areRotation(s1, s2));
    }

    private static boolean areRotation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        String temp = s1 + s2;
        System.out.println(s1 + " " + s2 + " " + temp);
        return temp.contains(s2);
    }
}
