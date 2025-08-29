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
        Map<Integer, String> collect = Stream.of("a", "bb", "ccc", "dd", "eee", "f", "ggg");
        printResult(collect);
    }

    private static void printResult(Map<Integer, String> collect) {
        
    }
}
