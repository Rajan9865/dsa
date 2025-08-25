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
        System.out.println(name);
//non empty optional
        Optional<String> name1 = Optional.ofNullable(null);
        System.out.println(name1);
        Optional<String> name2 = Optional.of("Rajan");
        if (name2.isPresent()) {
            System.out.println(name2.get());
        }
        name2.ifPresent(s -> System.out.println("vaklues is present: " + s));

        
    }
}
