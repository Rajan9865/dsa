package java8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 9/26/2025
 */
public class AnagramCheck {
    public static void main(String[] args) {
        System.out.println("both string are anagram " + isAnagram("listen", "silent"));
        System.out.println("both string are anagram " + isAnagram("triangle", "integral"));
        System.out.println("both string are anagram " + isAnagram("apple", "pale"));
        System.out.println("***************************************");
        System.out.println("***************************************");
        System.out.println("both string are anagram " + SecondWayToCheckIsAnagram("listen", "silent"));
        System.out.println("both string are anagram " + SecondWayToCheckIsAnagram("triangle", "integral"));
        System.out.println("both string are anagram " + SecondWayToCheckIsAnagram("apple", "pale"));
    }

    private static boolean SecondWayToCheckIsAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        Map<Character, Long> collect1 = s1.toLowerCase().chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<Character, Long> collect2 = s2.toLowerCase().chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return collect1.equals(collect2);
    }

    private static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        String sorted1 = str1.toLowerCase().chars().sorted().mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
        String sorted2 = str2.toLowerCase().chars().sorted().mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
        return sorted1.equals(sorted2);
    }
}
