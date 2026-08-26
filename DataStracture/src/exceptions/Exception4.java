package exceptions;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 8/24/2026
 */
public class Exception4 {
    static void main() {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic");
        } catch (NullPointerException e) {
            System.out.println("Null");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
