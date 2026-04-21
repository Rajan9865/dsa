package multithreading.concept.multithreadingdesgnpattern;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/21/2026
 */
public class GuardedSuspensionDemo {
    public static void main(String[] args) {
        Guarded guarded = new Guarded();
        new Thread(() -> {
            try {
                System.out.println("waiting for task........");
                System.out.println("received ..." + guarded.get());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }).start();
        new Thread(() -> {
            try {
                Thread.sleep(2000);
                guarded.set("data is ready");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }
}

class Guarded {
    private String response;

    public synchronized String get() throws InterruptedException {
        while (response == null) {
            wait();
        }
        return response;
    }

    public synchronized void set(String value) {
        response = value;
        notifyAll();
    }
}