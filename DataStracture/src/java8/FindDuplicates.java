package java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 9/24/2025
 */
public class FindDuplicates {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 2, 3, 3, 6, 1);
        Map<Integer, Long> result = countFrequency(number);
        System.out.println(result);
        Map<Integer, Long> duplicatesItems = duplicatesElement(result);
        System.out.println(duplicatesItems);
        Map<Integer, Long> duplicatesItems1 = duplicatesElement1(result);
        System.out.println(duplicatesItems1);
    }

    private static Map<Integer, Long> duplicatesElement1(Map<Integer, Long> result) {
        return result.entrySet().stream().filter(p -> p.getValue() > 1)
                .sorted(Map.Entry.<Integer, Long>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));
    }

    private static Map<Integer, Long> duplicatesElement(Map<Integer, Long> result) {
        return result.entrySet().stream().filter(p -> p.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    private static Map<Integer, Long> countFrequency(List<Integer> number) {
        return number.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
