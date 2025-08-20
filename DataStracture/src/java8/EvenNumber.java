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
        System.out.println("Using method reference:");
        List<Integer> result1 = number.stream().filter(EvenNumber::isEven).collect(Collectors.toList());
        print(result1);
        System.out.println("Using method reference with lambda:");
        List<Integer> result2 = number.stream().filter(integer -> isEven(integer)).collect(Collectors.toList());
        print(result2);
        System.out.println("Using method reference with lambda and method:");
        List<Integer> result3 = number.stream().filter(EvenNumber::isEven).collect(Collectors.toList());
        print(result3);
    }

    private static boolean isEven(Integer integer) {
        return integer % 2 == 0;
    }

    private static void print(List<Integer> result) {
        result.forEach(s -> System.out.print(s + " "));
        System.out.println();
        System.out.println("Total even numbers: " + result.size());
    }

    private static List<Integer> evennumber(List<Integer> number) {
        return number.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
    }
}
