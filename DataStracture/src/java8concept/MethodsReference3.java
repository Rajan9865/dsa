package java8concept;

import java.util.Arrays;
import java.util.List;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 8/22/2025
 */
public class MethodsReference3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Rajan", "Kumar", "Java", "8");
        names.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
        System.out.println(names); // with lambda expression
        names.sort(String::compareToIgnoreCase);
        System.out.println(names);// with method reference
        names.forEach(System.out::println); // using method reference to print each name
    }
}
