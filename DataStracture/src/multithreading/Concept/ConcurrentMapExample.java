package multithreading.Concept;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 3/31/2026
 */
public class ConcurrentMapExample {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        System.out.println(map);
    }
}
