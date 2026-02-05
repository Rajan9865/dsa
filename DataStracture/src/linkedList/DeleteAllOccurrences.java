package linkedList;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 2/4/2026
 */
public class DeleteAllOccurrences {
    public static void main(String[] args) {
        Node22 a = new Node22(1);
        Node22 b = new Node22(2);
        Node22 c = new Node22(3);
        Node22 d = new Node22(2);
        Node22 e = new Node22(1);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        int k = 2;
        a = deleteAllOccurrence(a, k);
        printLinkedList(a);
    }

    private static void printLinkedList(Node22 head) {
        Node22 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -");
            temp = temp.next;
        }
        System.out.println("null");
    }

    private static Node22 deleteAllOccurrence(Node22 head, int k) {
        if (head == null && head.data == k) {
            return head;
        }
        Node22 curr = head;
        while (curr != null && curr.next != null) {
            if (curr.next.data == k) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }
}
