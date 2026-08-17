package playground;


/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 7/30/2026
 */
public class KeyGenerator {
    static void main() {
        String s = "java";
        s.concat("language");
        System.out.println(s);
        System.out.println("****************");
        System.out.println("****************");
        String s1 = new String("Java");
        String s2 = new String("Java");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

    }
}
