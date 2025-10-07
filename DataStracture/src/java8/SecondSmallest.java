package java8;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 10/7/2025
 */
public class SecondSmallest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(8, 3, 10, 1, 6, 3, 1);
        Optional<Integer> output = secondSmallest(numbers);
        Optional<Integer> output1 = secondSmallestOrderofn(numbers);
        secondSmallestTraditional(numbers);
        output.ifPresent(p -> System.out.println(p));
        output1.ifPresent(p -> System.out.println(p));
    }

    private static void secondSmallestTraditional(List<Integer> numbers) {
        int smallest = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;
        for (int num : numbers) {
            if (num < smallest) {
                secondsmallest = smallest;
                smallest = num;
            } else if (num > smallest && num < secondsmallest) {
                secondsmallest = num;
            }
        }
        if (secondsmallest == Integer.MAX_VALUE) {
            System.out.println("No second smallest element (all elements may be equal)");
        } else {
            System.out.println("2nds smallest number " + secondsmallest);
        }
    }

    private static Optional<Integer> secondSmallestOrderofn(List<Integer> numbers) {
        Map<String, String> map = new HashMap<>();
        return numbers.stream().distinct().collect(Collectors.collectingAndThen(Collectors.toList(),
                list -> {
                    Integer min = Collections.min(list);
                    list.remove(min);
                    return list.isEmpty() ? Optional.empty() : Optional.of(Collections.min(list));
                }));
    }

    private static Optional<Integer> secondSmallest(List<Integer> numbers) {
        return numbers.stream().distinct().sorted().skip(1).findFirst(); //nlogn
    }
}
