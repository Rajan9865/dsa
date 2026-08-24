package multithreading.concept.multithreadingdesgnpattern;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/21/2026
 */
public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {

    }

    private static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        System.out.println("main begin");
        Singleton.getInstance();
    }
}
