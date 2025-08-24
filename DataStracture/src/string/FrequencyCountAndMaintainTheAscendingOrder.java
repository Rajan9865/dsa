package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 8/24/2025
 */
public class FrequencyCountAndMaintainTheAscendingOrder {
    public static void main(String[] args) {
        String str = "rajan kumar";
        Map<Character, Integer> output = frequencyCount(str);
        List<Map.Entry<Character, Integer>> sortbyCharacter = sortByCharacter(output);
        printResult(sortbyCharacter);
    }

    private static void printResult(List<Map.Entry<Character, Integer>> sortbyCharacter) {
        for (Map.Entry<Character, Integer> entry : sortbyCharacter) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    private static List<Map.Entry<Character, Integer>> sortByCharacter(Map<Character, Integer> output) {
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(output.entrySet());
        list.sort(Map.Entry.comparingByKey());
        return list;
    }

    private static Map<Character, Integer> frequencyCount(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        return map;
    }
}
