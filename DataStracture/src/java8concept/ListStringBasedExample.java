package java8concept;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 9/15/2025
 */
public class ListStringBasedExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("rajan", "kumar", "singh", "apple", "bananan");
        List<String> filteredName = filteredName(names);
        List<String> sortName = sortName(names);
        List<String> revereseOrder = reversedOrder(names);

        printResult(filteredName);
        printResult(sortName);
        System.out.println("reverse order");
        printResult(revereseOrder);
    }

    private static List<String> reversedOrder(List<String> names) {
//        return names.stream().sorted((s1, s2) -> s2.compareToIgnoreCase(s1)).collect(Collectors.toList());
        return names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//        return names.stream().sorted((s1, s2) -> s2.compareToIgnoreCase(s1)).collect(Collectors.toList());
    }

    private static List<String> sortName(List<String> names) {
        return names.stream().sorted().collect(Collectors.toList());
    }

    private static void printResult(List<String> filteredName) {
        filteredName.forEach(s -> System.out.println(s));
    }

    private static List<String> filteredName(List<String> names) {
        return names.stream().filter(name -> name.startsWith("a")).collect(Collectors.toList());
    }
}
