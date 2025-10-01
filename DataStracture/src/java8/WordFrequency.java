package java8;

import java.util.Arrays;
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
public class WordFrequency {
    public static void main(String[] args) {
        String sentence = "Java is great and Java is powerful";
        Map<String, Long> streamOutput = wordFrequency(sentence);
        Map<String, Integer> loopOutput = wordFrequencyTradational(sentence);
        System.out.println("Using Streams (preserve order):");
        printOutput(streamOutput);

        System.out.println("\n**********");
        System.out.println("Using Traditional Loop:");
        System.out.println(loopOutput);
    }

    private static void printOutput(Map<String, Long> output) {
        output.forEach((s1, s2) -> System.out.print(s1 + " " + s2 + " "));
    }

    private static Map<String, Long> wordFrequency(String sentence) {
//        String[] split = sentence.split("\\s");
//        return Arrays.stream(sentence.split("\\s"))
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return Arrays.stream(sentence.split("\\s"))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
    }

    private static Map<String, Integer> wordFrequencyTradational(String sentence) {
        String[] split = sentence.split("\\s");
        Map<String, Integer> map = new HashMap<>();
        for (String str : split) {
            if (map.containsKey(str)) {
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }
        return map;
    }
}
