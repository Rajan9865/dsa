package multithreading.concept.virtualthread;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/17/2026
 */
public class VirtualThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        final int threadcount = 1000;
        List<Thread> threads = new ArrayList<Thread>();
        Runnable task = () -> {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        long startTime = System.nanoTime();
        for (int i = 0; i < threadcount; i++) {
//            Thread thread = new Thread(task);
            Thread thread = Thread.ofVirtual().start(task);
            thread.setName("thread" + i);
//            thread.start();
            System.out.println("thread number " + i);
            threads.add(thread);
        }
        for (Thread thread : threads) {
            thread.join();
            System.out.println("complete thread " + thread.getName());
        }

        long endTime = System.nanoTime();

        long durationMs = (endTime - startTime) / 1_000_000;
        System.out.println("Total time: " + durationMs + " ms");
    }
}
