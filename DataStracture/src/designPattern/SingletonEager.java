package designPattern;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 12/8/2025
 */
public class SingletonEager {
    public static void main(String[] args) {
        MySingleton mySingleton = MySingleton.getInstance();
        MySingleton mySingleton1 = MySingleton.getInstance();
        mySingleton.show();
        System.out.println(mySingleton == mySingleton1 ? "same instace " : "differenct instance ");
    }
}

class MySingleton {
    private static final MySingleton instance = new MySingleton();

    private MySingleton() {
        System.out.println("eager singleton object is created");
    }

    public static MySingleton getInstance() {
        return instance;
    }

    public void show() {
        System.out.println("inside eager singleton ");
    }
}