package revision;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 1/7/2026
 */
public class MiddleLinkedList {
    public static void main(String[] args) {
        Node22 a = new Node22(1);
        Node22 b = new Node22(2);
        Node22 c = new Node22(3);
        Node22 d = new Node22(4);
        Node22 e = new Node22(5);
//        Node22 f = new Node22(6);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
//        e.next = f;
        int result = middleElement(a);
        System.out.println("Middle element is " + result);
    }

    private static int middleElement(Node22 head) {
        if (head == null || head.next == null) {
            return -1;
        }
        Node22 slow = head;
        Node22 fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
}
