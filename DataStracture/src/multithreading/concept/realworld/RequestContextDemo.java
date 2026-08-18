package multithreading.concept.realworld;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/23/2026
 */
public class RequestContextDemo {
    private static ThreadLocal<String> userContext = new ThreadLocal<>();

    public static void main(String[] args) {
        Runnable task = () -> {
            userContext.set(Thread.currentThread().getName());
            System.out.println("handling request for : " + userContext.get());
        };
        for (int i = 1; i <= 10; i++) {
            new Thread(task).start();
        }
    }
}
