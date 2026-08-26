package exceptions;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 8/24/2026
 */
public class Exception2 {
    static void main() {
        System.out.println(test2());
    }

    private static int test2() {
        try {
            int x = 10 / 0;
            return 10;
        } finally {
            return 100;
        }
    }
}
