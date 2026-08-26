package exceptions;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 8/24/2026
 */
public class Exception1 {
    static void main() {
        System.out.println(test1());
    }

    private static int test1() {
        int x = 10;
        try {
            return x;
        } finally {
//            x = 20;
            return 20;
        }
    }
}
