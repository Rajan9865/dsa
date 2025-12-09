package revision;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 12/9/2025
 */
public class SingletonEager {
    public static void main(String[] args) {
        MySingletonEager e1 = MySingletonEager.getInstance();
        MySingletonEager e2 = MySingletonEager.getInstance();
        e1.show();
        System.out.println(e1 == e2 ? "same object" : "different object");
    }
}

class MySingletonEager {
    private static final MySingletonEager instance = new MySingletonEager();

    private MySingletonEager() {
        System.out.println("constructor object created");
    }

    public static MySingletonEager getInstance() {
        return instance;
    }

    public void show() {
        System.out.println("public show method object created");
    }

}
