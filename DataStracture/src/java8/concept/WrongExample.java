package java8.concept;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/7/2026
 */
public class WrongExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        IntStream.range(1, 1000).parallel().forEach(list::add);
        System.out.println(list.size());
        List<Integer> list1 = IntStream.range(0, 1000).parallel().boxed().collect(Collectors.toList());
        System.out.println(list1.size());
    }
}
