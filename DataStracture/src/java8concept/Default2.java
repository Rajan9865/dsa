package java8concept;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 8/22/2025
 */
interface Calculator {
    static int add(int a, int b) {
        return a + b;
    }

    default int multiply(int a, int b) {
        return a * b;
    }

    void print();
}

class Something implements Calculator {

    @Override
    public void print() {
        System.out.println("Hello, World!");
    }
}

public class Default2 {
    public static void main(String[] args) {
        Calculator calculator = new Something();
        calculator.print();
        System.out.println("multiply: " + calculator.multiply(5, 10));
        System.out.println("add: " + Calculator.add(5, 10));
        // Using static method from interface
        // Using default method from interface
    }
}
