package java8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 10/1/2025
 */
public class CharacterFrequency {
    public static void main(String[] args) {
        String input = "programming";
        Map<Character, Long> freqUnordered = frequency(input);
        Map<Character, Long> freqOrdered = frequency1(input);
        Map<Character, Integer> freqTraditional = frequencyTraditionalWay(input);
        System.out.println("Using Streams (unordered):");
        printOutput(freqUnordered);
        System.out.println("\n****************");

        System.out.println("Using Streams (LinkedHashMap, preserves order):");
        printOutput(freqOrdered);
        System.out.println("\n****************");

        System.out.println("Using Traditional Loop:");
        System.out.println(freqTraditional);
    }

    private static void printOutput(Map<Character, Long> output) {
//        output.entrySet().forEach(s -> System.out.print(s.getKey() + "->" + s.getValue() + " "));
        output.forEach((s1, s2) -> System.out.print(s1 + ":" + s2 + " "));
    }

    private static Map<Character, Long> frequency(String input) {
        return input.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    private static Map<Character, Long> frequency1(String input) {
        return input.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
    }

    private static Map<Character, Integer> frequencyTraditionalWay(String input) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : input.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }
}
