package multithreading.concept.threadlocal;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/17/2026
 */
public class ThreadLocalBasic {
    private static ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) {
        Runnable task = () -> {
            threadLocal.set((int) (Math.random() * 100));
            System.out.println(Thread.currentThread().getName() + " value is " + threadLocal.get());
        };
        for (int i = 0; i < 3; i++) {
            new Thread(task).start();
        }
    }
}
