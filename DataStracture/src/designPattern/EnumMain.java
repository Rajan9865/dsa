package designPattern;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 12/8/2025
 */
public class EnumMain {
    public static void main(String[] args) {
        EnumSingleton e1 = EnumSingleton.INSTANCE;
        EnumSingleton e2 = EnumSingleton.INSTANCE;
        e1.show();
        System.out.println(e1 == e2 ? "same object " : "different object");
    }
}

enum EnumSingleton {
    INSTANCE;

    public void show() {
        System.out.println("inside Enum singleton");
    }
}
