package playground;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 3/24/2026
 */
public class FailFast {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new CopyOnWriteArrayList<>();
        list1.add(1);
        list.add(1);
        list.add(2);
//        for (Integer i : list) {
//            list.add(3);
//        }
        Iterator<Integer> iterator = list.iterator();
        for (Iterator<Integer> it = iterator; it.hasNext(); ) {
            Integer i = it.next();
//            i.next();
//            i.remove();
        }
        System.out.println(list);
    }
}
