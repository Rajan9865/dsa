package top100dsa;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 9/17/2026
 */
public class MiddleOfLinkedListUsingFastAndSlowPointer {
    static void main() {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        Node result = findMiddle(a);
        System.out.println("middle node is " + result.data);
    }

    private static Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
