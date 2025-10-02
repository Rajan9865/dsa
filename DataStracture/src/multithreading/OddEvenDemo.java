package multithreading;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 10/2/2025
 */
class NumberPrinter {
    private int num = 1;
    private final int max = 20;

    public synchronized void printOdd() {
        while (num < max) {
            while (num % 2 == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("odd number" + num++);
            notify();
        }
    }

    public synchronized void printEven() {
        while (num < max) {
            while (num % 2 == 1) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("even number " + num++);
            notify();
        }
    }
}

public class OddEvenDemo {
    public static void main(String[] args) {
        NumberPrinter numberPrinter = new NumberPrinter();
        Thread thread1 = new Thread(() -> numberPrinter.printOdd());
        Thread thread2 = new Thread(() -> numberPrinter.printEven());
        thread1.start();
        thread2.start();
    }
}
