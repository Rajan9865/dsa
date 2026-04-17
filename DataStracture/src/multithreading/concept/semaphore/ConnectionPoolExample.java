package multithreading.concept.semaphore;

import java.util.concurrent.Semaphore;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/16/2026
 */
public class ConnectionPoolExample {
    public static void main(String[] args) {
        ConnectionPool connectionPool = new ConnectionPool();
        for (int i = 0; i < 10; i++) {
            new Thread(connectionPool::connect).start();
        }
    }
}

class ConnectionPool {
    private static Semaphore semaphore = new Semaphore(1);

    public void connect() {
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + " got a connection");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(Thread.currentThread().getName() + " releasing a connection");
            semaphore.release();
        }
    }
}
