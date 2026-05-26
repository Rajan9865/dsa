package multithreading.concept.virtualthread;

/**
 * @version 1.0
 * Dsa
 * @Rajan kumar
 * @since 4/27/2026
 */
public class BlockingVirtualThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = Thread.startVirtualThread(() ->
//        Thread thread = new Thread(() ->
        {
            try {
                System.out.println("start");
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(20);
                System.out.println("end");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start();
        thread.join();
    }
}
