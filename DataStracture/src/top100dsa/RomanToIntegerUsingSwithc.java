package top100dsa;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 9/23/2026
 */
public class RomanToIntegerUsingSwithc {
    static void main() {
        String[] str = {"III", "IV", "CM"};
        for (String s : str) {
            System.out.println(s + " ->" + romanTointegers(s));
        }
    }

    private static int romanTointegers(String string) {
        int result = 0;
        for (int i = 0; i < string.length(); i++) {
            int current = getValue(string.charAt(i));
            if (i + 1 < string.length()) {
                int next = getValue(string.charAt(i + 1));
                if (current < next) {
                    result -= current;
                } else
                    result += current;
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
