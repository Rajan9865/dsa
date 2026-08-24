package top100dsa;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 8/19/2026
 */
public class ReverseStringTwoPointer {
    static void main() {
        String str = "java backend";
        System.out.println("Original String: " + str);
        System.out.println("reverse string " + reverse(str));
    }

    private static String reverse(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return new String(charArray);
    }
}
