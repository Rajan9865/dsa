package top100dsa.revision;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 9/24/2026
 */
public class RomanToInteger {
    static void main() {
        String[] str = {"III", "IV", "CM"};
        for (String s : str) {
            System.out.println(s + "->" + romanTOINteger(s));
        }
    }

    private static int romanTOINteger(String string) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = 0;
        for (int i = 0; i < string.length(); i++) {
            int current = map.get(string.charAt(i));
            if (i + 1 < string.length()) {
                int next = map.get(string.charAt(i + 1));
                if (current < next) {
                    result -= current;
                } else {
                    result += current;
                }
            } else
                result += current;
        }
        return result;
    }
}
