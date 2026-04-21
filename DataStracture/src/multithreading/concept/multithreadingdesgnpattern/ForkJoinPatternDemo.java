package multithreading.concept.multithreadingdesgnpattern;


import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/21/2026
 */
public class ForkJoinPatternDemo {
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        int result = pool.invoke(new Sumvalue(1, 10));
        System.out.println("sum " + result);
    }
}

class Sumvalue extends RecursiveTask<Integer> {
    int start, end;

    Sumvalue(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        if (end - start <= 2) {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                sum += i;
            }
            return sum;
        }
        int middle = (start + end) / 2;
        Sumvalue left = new Sumvalue(start, middle);
        Sumvalue right = new Sumvalue(middle + 1, end);
        left.fork();
        int rightResult = right.compute();
        int leftResult = left.join();
        return leftResult + rightResult;
    }
}
