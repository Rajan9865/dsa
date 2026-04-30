package multithreading.concept.realworld;

import java.util.concurrent.CompletableFuture;


/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/23/2026
 */
public class ApiAggregatorDemo {
    public static void main(String[] args) {

        CompletableFuture<String> user =
                CompletableFuture.supplyAsync(() -> getUser());

        CompletableFuture<String> orders =
                CompletableFuture.supplyAsync(() -> getOrders());

        CompletableFuture<String> payment =
                CompletableFuture.supplyAsync(() -> getPayment());

        CompletableFuture<String> result =
                user.thenCombine(orders, (u, o) -> u + " + " + o)
                        .thenCombine(payment, (uo, p) -> uo + " + " + p);

        System.out.println(result.join());
    }

    private static String getUser() {
        sleep(1000);
        return "User";
    }

    private static String getOrders() {
        sleep(1000);
        return "Orders";
    }

    private static String getPayment() {
        sleep(1000);
        return "Payment";
    }

    private static void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (Exception e) {
        }
    }
}
