package playground;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 8/4/2026
 */
public class failFast1 {
    static void main() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
//            list.remove(2);
//            list.add("hello");
            list.remove(s);
            list.add(s);
        }
        System.out.println(list);
    }
}
