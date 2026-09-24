package top100dsa;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 9/23/2026
 */
public class romanToInteger {
    static void main() {
        String[] str = {"III", "IV", "CM", "IX"};
        for (String s : str) {
            int result = romanToIntegers(s);
            System.out.println(s + "->" + result);
        }
    }

    private static int romanToIntegers(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int current = map.get(s.charAt(i));
            if (i + 1 < s.length()) {
                int next = map.get(s.charAt(i + 1));
                if (current < next) {
                    result -= current;
                } else {
                    result += current;
                }
            } else {
                result += current;
            }
        }
        return result;
    }
}
