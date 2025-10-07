package multithreading;

/**
 * @author Rajan Kumar
 * @version 1.1
 * Demonstrates Thread Life Cycle
 * @since 10/7/2025
 */
class MyThread1 extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("Inside run(): Thread is RUNNING -> " + Thread.currentThread().getName());
            System.out.println("Current state inside run(): " + Thread.currentThread().getState());

            // Simulate waiting/sleeping state
            System.out.println("Thread going to sleep...");
            Thread.sleep(1000);

            System.out.println("Thread waking up and finishing: " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted");
        }
    }
}

public class ThreadLifeCycleDemo {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();

        // NEW state
        System.out.println("State after creating thread: " + myThread1.getState()); // NEW

        // Start the thread -> RUNNABLE
        myThread1.start();
        System.out.println("State after calling start(): " + myThread1.getState()); // RUNNABLE

        try {
            // Give the thread some time to enter RUNNABLE or TIMED_WAITING
            Thread.sleep(100);
            System.out.println("State while thread is RUNNABLE: " + myThread1.getState());

            // Wait for thread to enter sleep (TIMED_WAITING)
            Thread.sleep(300);
            System.out.println("State while thread is sleeping (TIMED_WAITING): " + myThread1.getState());

            // Wait for it to finish
            myThread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // TERMINATED
        System.out.println(Thread.currentThread().getName());
        System.out.println(myThread1.getName());
        System.out.println("State after thread finished: " + myThread1.getState());
    }
}
