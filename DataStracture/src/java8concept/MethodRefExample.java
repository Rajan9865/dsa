package java8concept;

import java.util.Arrays;
import java.util.List;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 8/20/2025
 */
public class MethodRefExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Rajan", "Kumar", "Java", "8");
        methodsReferece(names);

        names.forEach(s -> System.out.print(s));
    }

    private static void methodsReferece(List<String> names) {
        names.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
