package java8concept;

import java.util.Optional;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 8/25/2025
 */
public class FlatMapExample {
    public static void main(String[] args) {
        Optional<String> s1 = Optional.of("Rajan");
        Optional<String> s2 = s1.flatMap(s -> toUppercase(s));
        s2.ifPresent(s -> System.out.println(s));

    }

    private static Optional<String> toUppercase(String s) {
        return Optional.of(s.toUpperCase());
    }
}
