package stringrevision;

import java.util.Scanner;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 7/1/2026
 */
public class ReverseString {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a string :- ");
        String input = scanner.nextLine();
//        String input = "java";
        String result1 = reverseStringApproach1(input);
//        System.out.println("approach1: " + result1);
        String result2 = reverseStringApproach2(input);
//        System.out.println("approach2: " + result2);
        String result3 = reverseStringApproach3(input);
        System.out.println("approach3: " + result3);
    }

    private static String reverseStringApproach3(String input) {
        if (input == null || input.length() <= 1) {
            return input;
        }
        char[] charArray = input.toCharArray();
        int left = 0;
        int right = input.length() - 1;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
//        return new String(charArray);
        return String.valueOf(charArray);
    }

    private static String reverseStringApproach2(String input) {
        char[] arr = input.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
//        return String.valueOf(arr);
        return new String(arr);
    }

    private static String reverseStringApproach1(String input) {
        return new StringBuffer(input).reverse().toString();
    }
}
