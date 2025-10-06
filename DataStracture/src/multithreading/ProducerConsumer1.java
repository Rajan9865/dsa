package multithreading;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 10/6/2025
 */
class Buffer1 {
    private int data;
    private boolean availabnle = false;

    public void produce(int value) {
        if (availabnle) {

        }
        data = value;
        availabnle = true;
        System.out.println("produced " + value);
    }

    public void consumer() {
        if (!availabnle) {

        }
        System.out.println("consumed " + data);
        availabnle = false;
    }
}

public class ProducerConsumer1 {
    public static void main(String[] args) {
        Buffer1 buffer1 = new Buffer1();
        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 500; i++) {
                buffer1.produce(i);
                try {
//                    Thread.sleep(10);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 500; i++) {
                buffer1.consumer();
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });
        producer.start();
        consumer.start();
    }
}
