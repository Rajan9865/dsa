package revision;


/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 1/19/2026
 */
public class FindlengthofLoop {
    public static void main(String[] args) {
        Node22 a = new Node22(10);
        Node22 b = new Node22(20);
        Node22 c = new Node22(30);
        Node22 d = new Node22(40);
        Node22 e = new Node22(50);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = b;
        int result = countNodesInLoop(a);
        System.out.println("Loop Length: " + result);
    }

    private static int countNodesInLoop(Node22 head) {
        if (head == null) {
            return 0;
        }
        Node22 slow = head;
        Node22 fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return countloopLength(slow);
            }
        }
        return 0;
    }

    private static int countloopLength(Node22 slow) {
        Node22 current = slow;
        int count = 1;
        while (current.next != slow) {
            current = current.next;
            count++;
        }
        return count;
    }
}
