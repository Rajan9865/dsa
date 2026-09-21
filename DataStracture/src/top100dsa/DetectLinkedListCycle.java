package top100dsa;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 9/17/2026
 */
public class DetectLinkedListCycle {
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
        e.next = a;
        boolean result = detectLinkedListCycle(a);
        System.out.println("detectLinkedListCycle result: " + result);
    }

    private static boolean detectLinkedListCycle(Node head) {
        if (head == null)
            return false;
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }
}
