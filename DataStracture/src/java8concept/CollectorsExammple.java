package java8concept;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
        Set<String> collect1 = Stream.of("rajan", "kumar", "singh", "rajan").collect(Collectors.toSet());
        collect1.stream().forEach(s -> System.out.println(s));
        LinkedList<String> collect2 = Stream.of("a", "b", "c").collect(Collectors.toCollection(LinkedList::new));
        collect2.forEach(s -> System.out.println(s));

        Map<Integer, String> collect3 = Stream.of("a", "bb", "ccc").collect(Collectors.toMap(String::length, s -> s));
        collect3.entrySet().stream().forEach(s -> System.out.println(s));

        Stream.of("a", "bb", "ccc", "dd").collect(Collectors.toMap(String::length, s -> s, (s1, s2) -> s1 + "," + s2))
                .entrySet().stream().forEach(s -> System.out.println(s));

    }
}
