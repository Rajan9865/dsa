package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 9/16/2025
 */
public class Top3highestnumbers {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(10, 30, 50, 20, 60, 40);
        top3highestnumbers(number);
    }

    private static void top3highestnumbers(List<Integer> number) {
//    number.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(n -> System.out.println(n));
        number.stream().sorted((s1, s2) -> s2.compareTo(s1)).limit(3).forEach(n -> System.out.println(n));
    }
}
