package playground;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 8/4/2026
 */
public class FailSafe {
    static void main() {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            if (s.equals("a")) {
//                iterator.remove();
                list.remove(s);
                list.add("ssb");
            }

        }
        System.out.println(list);
    }
}
