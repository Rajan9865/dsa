package java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 9/18/2025
 */
public class FlattenMapValues {
    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>();
        map.put("vegitable", Arrays.asList("carrot", "brocolli", "bhindi", "ghobhi"));
        map.put("fruits", Arrays.asList("banana", "mango", "guva"));
        map.put("subject", Arrays.asList("math", "physiscs", "chemistry"));
        List<String> result = flatList(map);
        printResult(result);
    }

    private static void printResult(List<String> result) {
        result.forEach(s -> System.out.print(s + " "));
    }

    private static List<String> flatList(Map<String, List<String>> map) {
        return map.values().stream().flatMap(List::stream).collect(Collectors.toList());
    }
}
