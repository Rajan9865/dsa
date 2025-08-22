package java8concept;

import java.util.function.Consumer;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 8/22/2025
 */
public class MethodsReference2 {
    public void printMessage(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        MethodsReference2 methodsReference2 = new MethodsReference2();
        Consumer<String> consumer = (s) -> methodsReference2.printMessage(s);
        consumer.accept("Hello, World!  dear");
        Consumer<String> consumer1 = methodsReference2::printMessage;
        consumer1.accept("Hello, World!");

    }
}
