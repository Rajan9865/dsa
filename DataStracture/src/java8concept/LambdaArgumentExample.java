package java8concept;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 8/20/2025
 */
public class LambdaArgumentExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("rajan", "kumar", "java8", "lambda");
        filterNames(names, name -> name.startsWith("A"));
        filterNames(names, name -> name.length() > 3);
    }

    private static void filterNames(List<String> names, Predicate<String> prediction) {
        for (String name : names) {
            if (prediction.test(name)) {
                System.out.println(name);
            }
        }
    }
}
