package java8concept;

import java.util.function.Function;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 8/20/2025
 */
public class LambdaComposition {
    public static void main(String[] args) {
        Function<Integer, Integer> multiplyByTwo = x -> x * 2;
        Function<Integer, Integer> square = x -> x * x;
        Function<Integer, Integer> combinedFunction = multiplyByTwo.andThen(square);
        System.out.println(combinedFunction.apply(3));
        System.out.println(combinedFunction.hashCode());
        System.out.println(combinedFunction.getClass());
    }
}
