package multithreading;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 10/6/2025
 */
public class WorkerWithoutVolatile extends Thread {
    private boolean running = true;

    @Override
    public void run() {

        System.out.println("thread is running " + Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getState());
        while (running) {

        }
        System.out.println("thread stopped " + Thread.currentThread().getName());
    }

    public void stopRunningThread() {
        running = false;
    }

    public static void main(String[] args) {
        WorkerWithoutVolatile workerWithoutVolatile = new WorkerWithoutVolatile();
        System.out.println(Thread.currentThread().getState());
        workerWithoutVolatile.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("main thread stop worker " + Thread.currentThread().getName());
        workerWithoutVolatile.stopRunningThread();
    }
}
