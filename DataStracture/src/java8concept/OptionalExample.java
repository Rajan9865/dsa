package java8concept;

import java.util.Optional;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 8/24/2025
 */
public class OptionalExample {
    public static void main(String[] args) {
        //empty optional
        Optional<String> name = Optional.empty();
//non empty optional
        Optional<String> name1 = Optional.ofNullable(null);
        Optional<String> name2 = Optional.of("rajan");
        System.out.println(name);
        System.out.println(name1);
        System.out.println(name2);

    }
}
