package multithreading;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 9/29/2025
 */
public class ThreadStatesDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(1000);
                synchronized (ThreadStatesDemo.class) {
                    ThreadStatesDemo.class.wait();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        System.out.println("state after creatation " + thread.getState());
        thread.start();
        System.out.println("starter after start " + thread.getState());

        Thread.sleep(1000);
        System.out.println("state during sleeping " + thread.getState());

        Thread.sleep(2000);
        System.out.println("state during wait " + thread.getState());

        synchronized (ThreadStatesDemo.class) {
            ThreadStatesDemo.class.notify();
        }
        Thread.sleep(1000);
        System.out.println("final state " + thread.getState());
    }
}
