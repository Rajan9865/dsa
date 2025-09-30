package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 9/29/2025
 */
public class StringsStartingWith {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("apple", "banana", "avocado", "mango", "apricot", "berry");
        List<String> output = stringsStartingWith(names);
        List<String> output1 = stringsStartingWith1(names);

        output.stream().forEach(s -> System.out.print(s + " "));
        System.out.println();
        output1.forEach(s -> System.out.print(s + " "));
    }

    //using java traditional
    private static List<String> stringsStartingWith1(List<String> names) {
        List<String> result = new ArrayList<>();
        for (String name : names) {
            if (name.startsWith("a")) {
                result.add(name);
            }
        }
        return result;
    }

    //using java 8
    private static List<String> stringsStartingWith(List<String> names) {
        return names.stream().filter(p -> p.startsWith("a")).collect(Collectors.toList());
    }
}
