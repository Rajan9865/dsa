package playground;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 7/31/2026
 */
public class Str8ing2 {
    static void main() {
        String s1 = "Hello";
        String s2 = s1;

        s1 = s1 + " World";
        System.out.println(s1);
        System.out.println(s2);
        for (int i = 0; i < 1000; i++) {
            System.out.println();
        }
    }
}
