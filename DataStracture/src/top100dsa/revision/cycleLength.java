package top100dsa.revision;

import top100dsa.Node;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 9/21/2026
 */
public class cycleLength {
    static void main() {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
//        f.next = a;
        int result = findCycleLength(a);
        System.out.println("cycle length: " + result);
    }

    private static int findCycleLength(Node head) {
        if (head == null) return 0;
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                int length = 1;
                Node current = slow.next;
                while (current != slow) {
                    length++;
                    current = current.next;
                }
                return length;
            }
        }
        return 0;
    }
}
