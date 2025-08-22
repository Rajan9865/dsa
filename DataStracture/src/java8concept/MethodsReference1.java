package java8concept;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.List;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 8/22/2025
 */
public class MethodsReference1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Rajan", "Kumar", "Java", "8");
        printName(names);
        printName1(names);
    }

    private static void printName1(List<String> names) {
        names.forEach(Utils::print);
    }

    private static void printName(List<String> names) {
        names.stream().forEach(name -> Utils.print(name));
    }
}

class Utils {
    static void print(String s) {
        System.out.print(s + " ");
    }
}