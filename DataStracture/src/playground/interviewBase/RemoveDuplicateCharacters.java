package playground.interviewBase;

import java.util.LinkedHashSet;
import java.util.Set;
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
//        String result = removeDuplicateCharacter(str);
        String result = removeDuplicateCharacterUsingTraditionalApproach(str);
        System.out.println(result);
    }

    private static String removeDuplicateCharacterUsingTraditionalApproach(String str) {
        Set<Character> set = new LinkedHashSet<>();
        for (char ch : str.toCharArray()) {
            set.add(ch);
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : set) {
            sb.append(ch);
        }
        return sb.toString();
    }

    private static String removeDuplicateCharacter(String str) {
        return str.chars().mapToObj(c -> String.valueOf((char) c))
                .distinct()
                .collect(Collectors.joining());
    }
}
