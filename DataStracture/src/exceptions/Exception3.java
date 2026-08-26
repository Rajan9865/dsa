package exceptions;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 8/24/2026
 */
public class Exception3 {
    static void main() {
        /*try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Catch");
            throw new RuntimeException("No");
        } finally {
            System.out.println("Finally");
        }*/
        try {
            try {
                System.out.println("Inner Try");
                int x = 10 / 0;
            } finally {
                System.out.println("Inner Finally");
            }
        } catch (ArithmeticException e) {
            System.out.println("Outer Catch");
        } finally {
            System.out.println("Outer Finally");
        }
    }
}
