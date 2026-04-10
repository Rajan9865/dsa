package playground;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/1/2026
 */
public class StringPlayground {
    public static void main(String[] args) {
        String s1 = "Rajan";
        String s2 = "RaJan";
        String s3 = new String("Rajan");
        String s4 = s1 + s2 + s3;
        System.out.println(s1 == s2);
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}
