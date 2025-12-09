package revision;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 12/9/2025
 */
public class LazyMain {
    public static void main(String[] args) {
        LazySingleton e1 = LazySingleton.getInstance();
        LazySingleton e2 = LazySingleton.getInstance();
        e1.show();
        System.out.println(e1 == e2 ? "same instance " : "difference instance");
    }
}

class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
        System.out.println("lazy object is created by constrction");
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public void show() {
        System.out.println("void public methods ");
    }

}
