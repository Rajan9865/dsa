package revision;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 1/5/2026
 */
public class ReverseLinkedList1 {
    public static void main(String[] args) {
        Node22 a = new Node22(1);
        Node22 b = new Node22(2);
        Node22 c = new Node22(3);
        Node22 d = new Node22(4);
        Node22 e = new Node22(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        Node22 result = reverseLinkedList(a);
        printLinkedList(result);
    }

    private static void printLinkedList(Node22 head) {
        Node22 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    private static Node22 reverseLinkedList(Node22 head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node22 prev = null;
        Node22 current = head;
        while (current != null) {
            Node22 next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
