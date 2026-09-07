package multithreading.concept.multithreadingdesgnpattern;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/21/2026
 */
public class ThreadLocalPatternDemo {
    private static ThreadLocal<String> user = new ThreadLocal<>();

    public static void main(String[] args) {
        Runnable task = () -> {
            user.set(Thread.currentThread().getName());
            System.out.println("user " + user.get());
        };
        new Thread(task).start();
        new Thread(task).start();
    }
}
