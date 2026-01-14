package linkedList;

/**
 * Demonstrates how to detect a loop (cycle) in a singly linked list
 * using Floyd’s Cycle Detection Algorithm (also known as the
 * Tortoise and Hare algorithm).
 *
 * <p>
 * The program constructs a linked list with a deliberate cycle
 * and verifies whether the cycle exists by calling
 * {@link #detectLoopInLinkedList(Node22)}.
 * </p>
 *
 * <p>
 * This approach runs in O(n) time and uses O(1) extra space.
 * </p>
 *
 * @author Rajan Kumar
 * @version 1.0
 * @since 1/2/2026
 */
public class DetectLoopInLinkedList {
    /**
     * Entry point of the program.
     *
     * <p>
     * Creates a sample linked list with a cycle and prints whether
     * the linked list is circular.
     * </p>
     *
     * @param args command-line arguments (not used)
     */
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
        f.next = d;
        /**
         * Detects whether a given singly linked list contains a loop.
         *
         * <p>
         * This method uses two pointers (slow and fast) that move through
         * the list at different speeds. If the list contains a cycle,
         * the two pointers will eventually meet.
         * </p>
         *
         * @param head the head node of the linked list
         * @return {@code true} if the linked list contains a loop,
         *         {@code false} if the linked list is linear
         */
        boolean result = detectLoopInLinkedList(a);
        System.out.println("is circular linkedlist - " + result);
    }

    private static boolean detectLoopInLinkedList(Node22 head) {
        if (head == null) {
            return false;
        }
        Node22 slow = head;
        Node22 fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
