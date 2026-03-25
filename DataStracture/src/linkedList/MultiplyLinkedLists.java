package linkedList;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 2/10/2026
 */
public class MultiplyLinkedLists {
    public static void main(String[] args) {
        Node22 a = new Node22(3);
        Node22 b = new Node22(2);
        a.next = b;
        Node22 a1 = new Node22(2);
        System.out.println(multiplyTwoLists(a, a1));
    }

    private static long multiplyTwoLists(Node22 first, Node22 second) {
        final long MOD = 1000000007;
        long num1 = 0;
        long num2 = 0;
        while (first != null) {
            num1 = (num1 * 10 + first.data) % MOD;
            first = first.next;
        }
        while (second != null) {
            num2 = (num2 * 10 + second.data) % MOD;
            second = second.next;
        }
        return (num1 * num2) % MOD;
    }
}
