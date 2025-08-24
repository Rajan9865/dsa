package java8concept;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 8/22/2025
 */
interface A {
    default void show() {
        System.out.println("A show method");
    }
}

interface B {
    default void show() {
        System.out.println("B show method");
    }
}

class C implements A, B {
    public void show() {
        A.super.show();
//        B.super.show();
//        System.out.println("C show method");
    }
}

public class Default3 {
    public static void main(String[] args) {
        A a = new C();
        a.show(); // Calls the show method from class C, which in turn calls show methods
    }
}
