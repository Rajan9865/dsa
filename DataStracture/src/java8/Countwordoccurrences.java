package java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 8/25/2025
 */
public class Countwordoccurrences {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("rajankumar");
        String s1 = "rajankumar";
        List<String> name = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        Map<String, Long> result = countOccurrences(name);
        printResult(result);
        Map<String, Long> stringLongMap = countOccurrences1(list);
        System.out.println(stringLongMap);
        Map<String, Integer> stringLongMap1 = countOccurrences2(list);
        System.out.println(stringLongMap1);

        Map<Character, Integer> stringLongMap2 = countOccurrences3(s1);
        System.out.println(stringLongMap2);
    }

    private static Map<Character, Integer> countOccurrences3(String name) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : name.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }

    private static Map<String, Integer> countOccurrences2(List<String> list) {
        Map<String, Integer> output = new HashMap<>();
        for (String s : list) {
            for (char c : s.toCharArray()) {
                String key = String.valueOf(c);
                output.put(key, output.getOrDefault(key, 0) + 1);
            }
        }
        return output;
    }

    private static Map<String, Long> countOccurrences1(List<String> list) {
        return list.stream()
                .flatMap(s -> s.chars().mapToObj(c -> String.valueOf((char) c)))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


    }

    private static void printResult(Map<String, Long> result) {
        result.entrySet().stream().forEach(s -> System.out.println(s.getKey() + " : " + s.getValue()));
    }

    private static Map<String, Long> countOccurrences(List<String> name) {
        return name.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
