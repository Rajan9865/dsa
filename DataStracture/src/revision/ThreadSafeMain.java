package revision;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 12/9/2025
 */
public class ThreadSafeMain {
    public static void main(String[] args) {
        MySingletonThreadSafe e1 = MySingletonThreadSafe.getInstance();
        MySingletonThreadSafe e2 = MySingletonThreadSafe.getInstance();
        e1.show();
        System.out.println(e1 == e2 ? "same object" : "different object");
    }
}

class MySingletonThreadSafe {
    private static MySingletonThreadSafe instance;

    private MySingletonThreadSafe() {
        System.out.println("constructor object is created");
    }

    public static synchronized MySingletonThreadSafe getInstance() {
        if (instance == null) {
            synchronized (MySingletonThreadSafe.class) {
                if (instance == null) {
                    instance = new MySingletonThreadSafe();
                }
            }
        }
        return instance;
    }

    public void show() {
        System.out.println("show object is created");
    }
}
