package java8concept;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Rajan Kumar
 * @version 1.0
 * Dsa
 * @since 8/29/2025
 */
public class CollectorsExammple1 {
    public static void main(String[] args) {
        Stream<String> collect = Stream.of("a", "bb", "ccc", "dd", "eee", "f", "ggg");
        Map<Integer, String> collect1 = Stream.of("a", "bb", "ccc", "dd", "eee", "f", "ggg")
                .collect(Collectors.toMap(String::length, s -> s, String::concat));
        Map<Integer, String> collect2 = Stream.of("a", "bb", "ccc", "dd", "eee", "f", "ggg")
                .collect(Collectors.toMap(String::length, s -> s, (s1, s2) -> s1 + "," + s2));
        Map<Integer, String> collect3 = Stream.of("a", "bb", "ccc", "dd", "eee", "f", "ggg").collect(Collectors.toMap(String::length, s -> s));
        printResult(collect1);
        printResult(collect2);
//        printResult1(collect3);
    }

    private static void printResult1(Map<Integer, String> collect3) {
        collect3.entrySet().stream().forEach(s -> System.out.println("Key: " + s.getKey() + " Value: " + s.getValue()));
    }

    private static void printResult(Map<Integer, String> collect) {
        collect.forEach((key, value) -> System.out.println("Key: " + key + " Value: " + value));
    }
}
