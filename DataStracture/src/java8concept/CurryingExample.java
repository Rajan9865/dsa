package java8concept;

import java.util.function.Function;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 8/20/2025
 */
public class CurryingExample {
    public static void main(String[] args) {
        //Currying = breaking a function with multiple arguments into multiple single-argument functions.
        Function<Integer, Function<Integer, Integer>> add = x -> y -> x + y;
        System.out.println(add.apply(3).apply(5)); // Output: 8
    }
}
