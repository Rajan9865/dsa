package java8concept;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Rajan Kumar
 * @version 1.0
 * Dsa
 * @since 8/28/2025
 */
public class CollectorsExammple {
    public static void main(String[] args) {
        List<String> collect = Stream.of("rajan", "kumar", "singh").collect(Collectors.toList());
        collect.forEach(s -> System.out.println(s));
    }
}
