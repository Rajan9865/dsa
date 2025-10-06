package multithreading;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 10/6/2025
 */
class Buffer {
    private int data;
    private boolean available = false;

    public synchronized void produce(int vaule) {
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        data = vaule;
        available = true;
        System.out.println("produces " + vaule);
        notify();
    }

    public synchronized void consumer() {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("consumer " + data);
        available = false;
        notify();
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Thread thread = new Thread(() -> {
            for (int i = 1; i < 500; i++)
                buffer.produce(i);
        });
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i < 500; i++) {
                buffer.consumer();
            }
        });
        thread.start();
        thread1.start();
    }
}
