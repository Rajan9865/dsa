package linkedList;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 1/20/2026
 */
public class ReverseInGroups {
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
        int k = 3;
        a = reverseKGroup(a, k);
        printLinkedList(a);
    }

    private static void printLinkedList(Node22 head) {
        Node22 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    private static Node22 reverseKGroup(Node22 head, int group) {
        if (head == null || group <= 1) {
            return head;
        }
        Node22 current = head;
        Node22 previous = null;
        Node22 next = null;
        int count = 0;
        while (current != null && count < group) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
            count++;
        }
        if (next != null) {
            head.next = reverseKGroup(next, group);
        }
        return previous;
    }
}
