package playground;

import java.util.ArrayList;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 7/24/2026
 */
public class A {
    static void main() {
        String a = "hello";
//        a.concat("world");
        a = a.concat("world");
        System.out.println(a);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100000; i++)
            list.add(i);
        System.out.println(list.get(90000));
    }
}
