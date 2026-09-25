package playground.interviewBase;

import java.util.stream.Collectors;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 9/25/2026
 */
public class RemoveDuplicateCharacters {
    static void main() {
        String str = "programming";
        String result = removeDuplicateCharacter(str);
        System.out.println(result);
    }

    private static String removeDuplicateCharacter(String str) {
        return str.chars().mapToObj(c -> String.valueOf((char) c))
                .distinct()
                .collect(Collectors.joining());
    }
}
