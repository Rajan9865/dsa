package conceptRevision;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 12/11/2025
 */
public class Demo2 {
    public static void main(String[] args) {
/*
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "-> " + i);
            }
        });
        t1.start();
        System.out.println("main thread finished");
 */
        Runnable task = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + "->" + i);
            }
        };
        Thread t1 = new Thread(task);
        t1.start();
        System.out.println("main finished");
    }
}
