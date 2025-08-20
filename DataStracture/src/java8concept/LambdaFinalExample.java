package java8concept;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 8/20/2025
 */
public class LambdaFinalExample {
    public static void main(String[] args) {
        String gretting = "Hello";
//        gretting = "hi"; // This line will cause a compilation error if uncommented, as 'gretting' is effectively final.
        Runnable runnable = () -> System.out.println(gretting);
        runnable.run();
//        System.out.println(gretting);
    }
    
}
