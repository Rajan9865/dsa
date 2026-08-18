package playground;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 6/9/2026
 */
public class SafeRemovalExample {
    static void main() {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.equals("b")) {
                it.remove();
            }
        }
        System.out.println(list);
    }
}
