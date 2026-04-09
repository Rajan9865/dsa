package linkedList;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 2/13/2026
 */
public class ReverseBetweenAandB {
    public static void main(String[] args) {
        Node22 a = new Node22(1);
        Node22 b = new Node22(2);
        Node22 c = new Node22(3);
        Node22 d = new Node22(4);
        Node22 e = new Node22(5);
        Node22 f = new Node22(6);
        Node22 g = new Node22(7);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        int m = 2, n = 4;
        Node22 result = reverseBetween(a, m, n);
        printLinkedList(result);
    }

    private static Node22 reverseBetween(Node22 head, int m, int n) {
        if (head == null || m == n) return head;
        Node22 dummy = new Node22(0);
        dummy.next = head;
        Node22 prev = dummy;
        for (int i = 1; i < m; i++) {
            prev = prev.next;
        }
        Node22 start = prev.next;
        Node22 curr = start.next;
        for (int i = 0; i < n - m; i++) {
            start.next = curr.next;
            curr.next = prev.next;
            prev.next = curr;
            curr = start.next;
        }
        return dummy.next;
    }

    private static void printLinkedList(Node22 head) {
        Node22 temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-");
            temp = temp.next;
        }
        System.out.print("null");
    }
}
