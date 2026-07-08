package string;

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
        System.out.println("first non-repeating characters: " + firstNonRepeatingCharacterApparoaach1st(str));
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
