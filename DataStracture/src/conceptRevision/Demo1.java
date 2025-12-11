package conceptRevision;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 12/11/2025
 */
public class Demo1 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " " + Thread.currentThread().getName());
            }
        });
        thread.start();
        System.out.println("Main thread finished");
    }
}
