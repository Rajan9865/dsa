package java8concept;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 8/29/2025
 */
public class CollectorsExammple2 {
    public static void main(String[] args) {
        System.out.println(Stream.of("a", "b", "c", "b").collect(Collectors.counting()));
        System.out.println(Stream.of("java", "python", "node", "ruby").collect(Collectors.summingInt(String::length)));
        System.out.println(Stream.of("java", "python", "node", "ruby").collect(Collectors.averagingInt(String::length)));
    }
}
