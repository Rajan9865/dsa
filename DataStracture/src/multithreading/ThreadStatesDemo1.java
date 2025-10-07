package multithreading;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 10/7/2025
 */
public class ThreadStatesDemo1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== BLOCKED Demo ===");
        blockedDemo();

        System.out.println("\n=== WAITING (wait/notify) Demo ===");
        waitingDemo();

        System.out.println("\n=== TIMED_WAITING Demo ===");
        timedWaitingDemo();
    }

    private static void timedWaitingDemo() throws InterruptedException {
        Thread sleeper = new Thread(() -> {
            try {
                System.out.println("[sleeper] going to sleep for 1500 ms (TIMED_WAITING)");
                Thread.sleep(1500); // TIMED_WAITING
                System.out.println("[sleeper] woke up and finishing");
            } catch (InterruptedException e) {
                System.out.println("[sleeper] interrupted");
            }
        }, "Sleeper");

        sleeper.start();

        // give the thread a moment to enter sleep
        Thread.sleep(100);
        System.out.println("[main] sleeper state (should be TIMED_WAITING): " + sleeper.getState());

        // join with timeout demonstrates that main waits a limited time (main thread will be TIMED_WAITING during join)
        long joinTimeout = 500;
        System.out.println("[main] calling sleeper.join(" + joinTimeout + ") -- main thread will wait up to " + joinTimeout + "ms");
        long before = System.currentTimeMillis();
        sleeper.join(joinTimeout);
        long waited = System.currentTimeMillis() - before;
        System.out.println("[main] join returned after " + waited + " ms; sleeper state: " + sleeper.getState());

        // wait until sleeper finishes
        sleeper.join();
    }

    private static void waitingDemo() throws InterruptedException {
        final Object lock = new Object();

        Thread waiter = new Thread(() -> {
            synchronized (lock) {
                try {
                    System.out.println("[waiter] acquired lock and calling wait() -> will go to WAITING");
                    lock.wait(); // goes to WAITING until notify()
                    System.out.println("[waiter] resumed after notify()");
                } catch (InterruptedException e) {
                    System.out.println("[waiter] interrupted");
                }
            }
        }, "Waiter");

        Thread notifier = new Thread(() -> {
            try {
                // ensure waiter has started and called wait()
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
            synchronized (lock) {
                System.out.println("[notifier] acquired lock and will call notify()");
                lock.notify();
                System.out.println("[notifier] called notify() and will release lock");
            }
        }, "Notifier");

        waiter.start();

        // wait a bit so waiter acquires lock and calls wait()
        Thread.sleep(200);
        System.out.println("[main] waiter state (should be WAITING): " + waiter.getState());

        notifier.start();

        waiter.join();
        notifier.join();
    }

    private static void blockedDemo() throws InterruptedException {
        final Object lock = new Object();
        Thread locker = new Thread(() -> {
            synchronized (lock) {
                System.out.println("[locker] has acquired lock and will hold it for 2000 ms");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("[locker] releasing lock");
            }
        }, "locker");
        Thread blocker = new Thread(() -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("[blocker] attempting to acquire lock (will become BLOCKED if locker holds it)");
            synchronized (lock) {
                System.out.println("[blocker] acquired lock (this prints after locker releases it)");
            }
        }, "blocker");
        locker.start();
        blocker.start();

        // give time for locker to obtain lock and blocker to attempt to enter
        Thread.sleep(300);

        System.out.println("[main] locker state: " + locker.getState());   // likely TIMED_WAITING (sleep)
        System.out.println("[main] blocker state: " + blocker.getState()); // should be BLOCKED while waiting for lock

        locker.join();
        blocker.join();
    }
}
