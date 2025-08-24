package string;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 8/24/2025
 */
public class FrequencyCountAndMaintainTheAscendingOrder1 {
    public static void main(String[] args) {
        String name = "rajankumar";
        Map<Character, Long> output = frequencyCount(name);
        System.out.println(output);
        List<Map.Entry<Character, Long>> sortedList = sortedList(output);
        printResult(sortedList);
    }

    private static void printResult(List<Map.Entry<Character, Long>> sortedList) {
        sortedList.forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
    }

    private static List<Map.Entry<Character, Long>> sortedList(Map<Character, Long> output) {
        return output.entrySet().stream().sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toList());
    }

    private static Map<Character, Long> frequencyCount(String name) {
        return name.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
