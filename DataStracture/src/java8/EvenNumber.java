package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 8/20/2025
 */
public class EvenNumber {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result = evennumber(number);
        print(result);
    }

    private static void print(List<Integer> result) {
        result.forEach(s -> System.out.print(s + " "));
        System.out.println();
        System.out.println("Total even numbers: " + result.size());
    }

    private static List<Integer> evennumber(List<Integer> number) {
//        number.stream().filter(s -> s % 2 == 0).forEach(s -> System.out.print(s + " "));
//        return number.stream().filter(s -> s % 2 == 0).collect(Collectors.toList());
        return number.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
    }
}
