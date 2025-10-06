package multithreading;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 10/6/2025
 */
public class WorkerWithVolatile extends Thread {
    private volatile boolean running = true;

    @Override
    public void run() {
        System.out.println("thread started " + Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getState());
        while (running) {

        }
        System.out.println("thread stopped");
    }

    public void stopRunningThread() {
        running = false;
    }

    public static void main(String[] args) throws InterruptedException {
        WorkerWithVolatile workerWithVolatile = new WorkerWithVolatile();
        workerWithVolatile.start();
        Thread.sleep(1000);
        System.out.println("main thread stoppingg worker" + Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getState());
        workerWithVolatile.stopRunningThread();
    }
}
