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
public class failFast1Solution {
    static void main() {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");

        list.add("c");
        list.add("d");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            if (s.equals("a")) {
                iterator.remove();
//                list.remove(s);
//                list.add("hhh");
            }
        }
    }
}
