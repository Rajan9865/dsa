package playground;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 6/9/2026
 */
public class FailFastExample {
    static void main() {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.equals("c")) {
//                list.add("Rajan kumar");
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}
