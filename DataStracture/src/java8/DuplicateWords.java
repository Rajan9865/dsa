package java8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 10/8/2025
 */
public class DuplicateWords {
    public static void main(String[] args) {
        String sentence = "Java is great and Java is powerful because Java is platform independent";
        Map<String, Long> output = duplicateWords(sentence);
        Map<String, Long> output1 = duplicateWords1(sentence);
        System.out.println(output1);
        Map<String, Long> duplicateName1 = duplicateName(output1);
        System.out.println(duplicateName1);
        System.out.println(output);
    }

    private static Map<String, Long> duplicateName(Map<String, Long> output1) {
        return output1.entrySet().stream().filter(p -> p.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    private static Map<String, Long> duplicateWords1(String sentence) {
        return Arrays.stream(sentence.split("\\s+"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    private static Map<String, Long> duplicateWords(String sentence) {
        return Arrays.stream(sentence.split("\\s+"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(p -> p.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}
