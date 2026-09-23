package leetCode150;

import top100dsa.Node;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 9/22/2026
 */
public class LinkedListCycleUsingFastAndSlow {
    static void main() {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = c;
        boolean result = hascycle(a);
        System.out.println("has cycle: " + result);
    }

    private static boolean hascycle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }
}
