package multithreading.concept;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Rajan kumar
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
        Runnable task = () -> {
            map.put(4, "four");
            System.out.println(map);
        };
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        thread1.start();
        thread2.start();
    }
}
