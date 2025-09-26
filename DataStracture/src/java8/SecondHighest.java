package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 9/26/2025
 */
public class SecondHighest {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(10, 20, 30, 40, 20, 10, 50);
        Optional<Integer> result = secondHighest(number);
        printOutput(result);
    }

    private static void printOutput(Optional<Integer> result) {
        System.out.println(result.isPresent()
                ? "sencond highest element are " + result.get() : "second element are not found");
    }

    private static Optional<Integer> secondHighest(List<Integer> number) {
//        return number.stream().distinct().sorted(Comparator.reverseOrder())
//                .skip(1).findFirst();
        return number.stream().distinct().sorted((a, b) -> b.compareTo(a))
                .skip(1).findFirst();
    }
}
