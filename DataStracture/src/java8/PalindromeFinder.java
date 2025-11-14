package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
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
        System.out.println("**************************");
        List<String> result1 = palindromesBasic(list);
        System.out.println(result1);
        List<String> result2 = palindromesJava8(list);
        System.out.println(result2);
    }

    private static List<String> palindromesJava8(List<String> list) {
        Predicate<String> isPalindrome = PalindromeFinder::isPalindrome;
        return list.stream().filter(isPalindrome).collect(Collectors.toList());

    }

    private static List<String> palindromesBasic(List<String> list) {
        List<String> result = new ArrayList<>();
        for (String word : list) {
            if (isPalindrome(word)) {
                result.add(word);
            }
        }
        return result;
    }

    private static List<String> palindromes(List<String> list) {
        return list.stream().filter(word -> isPalindrome(word)).collect(Collectors.toList());
    }

    private static boolean isPalindrome(String word) {
        return word.equalsIgnoreCase(new StringBuilder(word).reverse().toString());
    }
}
