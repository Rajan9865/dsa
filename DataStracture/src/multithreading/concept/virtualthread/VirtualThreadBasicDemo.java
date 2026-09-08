package multithreading.concept.virtualthread;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/27/2026
 */
public class VirtualThreadBasicDemo {
    public static void main(String[] args) {
        Thread.startVirtualThread(() -> {
            System.out.println("running in " + Thread.currentThread());
        });
        System.out.println("main thread " + Thread.currentThread());
    }
}
