package multithreading.concept;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 3/30/2026
 */
public class RawThreadExample {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println("running  in :" + Thread.currentThread().getName());
        });
        t.start();
    }
}
