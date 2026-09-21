package top100dsa;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 9/21/2026
 */
public class detectCycleFindtheStartingNodeofCycle {
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
//        e.next = c;
        Node result = detechCycleAndFindFirst(a);
        System.out.println(result != null ? "cycle start at " + result.data : "no cycle found");
    }

    private static Node detechCycleAndFindFirst(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
