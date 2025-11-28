package java8;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 11/28/2025
 */
public class DuplicateCharacters {
    public static void main(String[] args) {
        String name = "Programming";
        Map<Character, Long> countCharacter = countCharacter(name);
        Map<Character, Long> output = duplicateCharacter(countCharacter);
        System.out.println(output);
        duplicateCharacter1(name);
        duplicateCharacter2(name);
    }

    private static void duplicateCharacter2(String name) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : name.toLowerCase().toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        map.entrySet().stream().filter(e -> e.getValue() > 1)
                .forEach(System.out::println);
    }

    private static void duplicateCharacter1(String name) {
        name.toLowerCase();
        int[] freq = new int[256];
        for (char c : name.toCharArray()) {
            freq[c]++;
        }
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 1) {
                System.out.print((char) i + "= " + freq[i] + " ");
            }
        }
    }

    private static Map<Character, Long> duplicateCharacter(Map<Character, Long> countCharacter) {
        return countCharacter.entrySet().stream().filter(e -> e.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    private static Map<Character, Long> countCharacter(String name) {
        return name.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
