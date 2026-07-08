package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 7/8/2026
 */
public class FirstNonRepeatingCharacter {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("1st approach first non-repeating characters: " + firstNonRepeatingCharacterApparoaach1st(str));
        System.out.println("2nd approach first non-repeating characters: " + firstNonRepeatingCharacter2ndApproach(str));
    }

    private static char firstNonRepeatingCharacter2ndApproach(String input) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : input.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : input.toCharArray()) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }
        return '$';
    }

    private static char firstNonRepeatingCharacterApparoaach1st(String input) {
        int[] freq = new int[26];
        for (int i = 0; i < input.length(); i++) {
            freq[input.charAt(i) - 'a']++;
        }
        for (int i = 0; i < input.length(); i++) {
            if (freq[input.charAt(i) - 'a'] == 1) {
                return input.charAt(i);
            }
        }
        return '$';
    }
}
