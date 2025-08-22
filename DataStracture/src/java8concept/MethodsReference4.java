package java8concept;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 8/22/2025
 */
public class MethodsReference4 {
    public static void main(String[] args) {
        Function<String, Student> studentFunction = name -> new Student("Rajan", 23);
        Student result1 = studentFunction.apply("Rajan");
        System.out.println(result1.name);// this is lambda expression

        BiFunction<String, Integer, Student> studentFunction1 = Student::new;
        Student resut = studentFunction1.apply("Rajan", 23);
        System.out.println(resut.name + " " + resut.age);
        // this is method reference
    }
}

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
