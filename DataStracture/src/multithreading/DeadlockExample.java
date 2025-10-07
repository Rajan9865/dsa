package multithreading;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 10/7/2025
 */
class SharedResource {
    void methodA(SharedResource others) {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " locked " + this);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " trying to lock " + others);
            synchronized (others) {
                System.out.println(Thread.currentThread().getName() + " locked both resources");
            }
        }
    }
}

public class DeadlockExample {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        SharedResource sharedResource1 = new SharedResource();
        
        Thread thread1 = new Thread(() -> sharedResource.methodA(sharedResource1), "Thread 1");
        Thread thread2 = new Thread(() -> sharedResource1.methodA(sharedResource), "Thread 2");

        thread1.start();
        thread2.start();
    }
}
