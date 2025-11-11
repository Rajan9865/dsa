package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 11/11/2025
 */
public class PalindromeFinder {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("madam", "apple", "racecar", "banana", "level", "java");
        List<String> result = palindromes(list);
        System.out.println(result);
    }

    private static List<String> palindromes(List<String> list) {
        return list.stream().filter(word -> isPalindrome(word)).collect(Collectors.toList());
    }

    private static boolean isPalindrome(String word) {
        return word.equalsIgnoreCase(new StringBuilder(word).reverse().toString());
    }
}
