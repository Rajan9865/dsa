package multithreading.Concept;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/6/2026
 */
public class ForkJoinDemo {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr = {1, 2, 3};
        ForkJoinPool pool = new ForkJoinPool();

        SumTask task = new SumTask(arr, 0, arr.length);
        int result = pool.invoke(task);

        pool.getPoolSize();
        System.out.println("sum = " + result);
    }
}

class SumTask extends RecursiveTask<Integer> {
    private int[] arr;
    private int start;
    private int end;

    public SumTask(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        if (end - start <= 2) {
            int sum = 0;
            for (int i = start; i < end; i++) {
                sum += arr[i];
            }
            return sum;
        }
        int middle = (start + end) / 2;
        SumTask leftTask = new SumTask(arr, start, middle);
        SumTask rightTask = new SumTask(arr, middle, end);
        leftTask.fork();
        int rightTaskResult = rightTask.compute();
        int leftTaskResult = leftTask.join();
        return leftTaskResult + rightTaskResult;
    }
}
