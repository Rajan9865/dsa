package playground;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 7/31/2026
 */
public class String1 {
    static void main() {
        StringBuilder sb = new StringBuilder("Java");
        StringBuilder sb2 = sb.append(" SE");
        String s1 = sb.toString();
        

        System.out.println(sb == sb2);
    }
}
