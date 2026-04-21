package multithreading.concept.threadlocal;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/17/2026
 */
public class ThreadLocalUserExample {
    public static void main(String[] args) {
        Runnable task = () -> {
            UserContext.setUser(Thread.currentThread().getName());
            System.out.println("user " + UserContext.getUser());
        };
        for (int i = 0; i < 10; i++) {
            new Thread(task).start();
        }
    }
}

class UserContext {
    private static ThreadLocal<String> user = new ThreadLocal<>();

    public static String getUser() {
        return user.get();
    }

    public static void setUser(String username) {
        user.set(username);
    }
}
