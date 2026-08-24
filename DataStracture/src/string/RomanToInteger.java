package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 7/9/2026
 */
public class RomanToInteger {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Roman number: ");
        String input = sc.nextLine().trim().toUpperCase();
        System.out.println("integer " + romantoDecimal(input));
        System.out.println("2nd approach integer " + romantoDecimal2ndApproach(input));
    }

    private static int romantoDecimal2ndApproach(String input) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = 0;
        for (int i = 0; i < input.length(); i++) {
            int current = map.get(input.charAt(i));
            if (i + 1 < input.length() && current < map.get(input.charAt(i + 1))) {
                result -= current;
            } else {
                result += current;
            }
        }
        return result;
    }

    private static int romantoDecimal(String input) {
        int result = 0;
        for (int i = 0; i < input.length(); i++) {
            int current = getValue(input.charAt(i));
            if (i + 1 < input.length()) {
                int next = getValue(input.charAt(i + 1));
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

    private static int getValue(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
