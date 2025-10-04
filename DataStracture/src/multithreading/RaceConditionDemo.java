package multithreading;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 10/3/2025
 */
public class RaceConditionDemo {
    private int count = 0;

    public void increment() {
        count++;
    }

    public static void main(String[] args) throws InterruptedException {
        RaceConditionDemo raceConditionDemo = new RaceConditionDemo();
        Runnable runnable = () ->
        {
            for (int i = 0; i < 20000; i++) {
                raceConditionDemo.increment();
            }
        };
        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(runnable);

        thread.start();
        thread1.start();

        thread.join();
        thread1.join();
        System.out.println("Final count (expected 20000): " + raceConditionDemo.count);
    }
}
