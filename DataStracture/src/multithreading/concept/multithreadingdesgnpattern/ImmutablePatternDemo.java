package multithreading.concept.multithreadingdesgnpattern;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/21/2026
 */
public class ImmutablePatternDemo {
    public static void main(String[] args) {
        User user = new User("Rajan kumar");
        System.out.println(user.getName());
    }
}

class User {
    User(String name) {
        this.name = name;
    }

    private final String name;

    public String getName() {
        return name;
    }
}