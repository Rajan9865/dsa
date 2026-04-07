package java8.concept;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/7/2026
 */
public class CoreConcept {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Processors: " + runtime.availableProcessors());
        System.out.println("Free Memory (MB): " + runtime.freeMemory() / (1024 * 1024));
        System.out.println("Max Memory (MB): " + runtime.maxMemory() / (1024 * 1024));
        System.out.println("Total Memory (MB): " + runtime.totalMemory() / (1024 * 1024));
    }
}
