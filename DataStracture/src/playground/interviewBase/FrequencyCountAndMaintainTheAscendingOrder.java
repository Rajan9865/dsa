package playground.interviewBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 10/5/2026
 */
public class FrequencyCountAndMaintainTheAscendingOrder {
    static void main() {
        String str = "rajan kumar";
        Map<Character, Integer> result = frequencyCount(str);
        System.out.println(result);

        List<Map.Entry<Character, Integer>> output = sortByCharacter1(result);
//        sortByCharacter(result);
    }

    private static List<Map.Entry<Character, Integer>> sortByCharacter1(Map<Character, Integer> result) {
        return result.entrySet().stream().sorted(Map.Entry.comparingByValue(Collector))
    }

    private static void sortByCharacter(Map<Character, Integer> result) {
        for (Map.Entry<Character, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    private static Map<Character, Integer> frequencyCount(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }
}
