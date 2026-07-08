package string.revision;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 7/8/2026
 */
public class StringRotation {
    static void main() {
        String s1 = "abcd";
        String s2 = "cdab";
        System.out.println(areRotations(s1, s2));
    }

    private static boolean areRotations(String s1, String s2) {
        if ((s1.length() != s2.length())) {
            return false;
        }
        String temp = s1 + s2;
        return temp.contains(s2);
    }
}
