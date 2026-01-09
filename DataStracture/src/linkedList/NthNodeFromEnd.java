package linkedList;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 1/9/2026
 */
public class NthNodeFromEnd {
    public static void main(String[] args) {
        Node22 a = new Node22(1);
        Node22 b = new Node22(2);
        Node22 c = new Node22(3);
        Node22 d = new Node22(4);
        Node22 e = new Node22(5);
        Node22 f = new Node22(6);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        int n = 3;
        int result = nthNodeFromEnd(a, n);
        System.out.println("nthNodeFromEnd result: " + result);
    }

    private static int nthNodeFromEnd(Node22 head, int n) {
        if (head == null || n <= 0) {
            return -1;
        }
        Node22 first = head;
        Node22 second = head;
        for (int i = 0; i < n; i++) {
            if (first == null) {
                return -1;
            }
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        return second.data;

    }
}
