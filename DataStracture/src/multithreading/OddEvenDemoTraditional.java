package multithreading;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 10/2/2025
 */
class Numberprinter1 {
    private int num = 2;
    private final int max = 40;

    public void oddNumber() {
        while (num < max) {
            while (num % 2 != 0) {
                System.out.println("odd number " + num++);
            }
        }
    }

    public void evenNumber() {
        while (num < max) {
            while (num % 2 == 0) {
                System.out.println("even number " + num++);
            }
        }
    }
}

public class OddEvenDemoTraditional {
    public static void main(String[] args) {
        Numberprinter1 numberPrinter = new Numberprinter1();
        Thread thread1 = new Thread(() -> numberPrinter.oddNumber());
        Thread thread2 = new Thread(() -> numberPrinter.evenNumber());
        thread1.start();
        thread2.start();
    }
}
