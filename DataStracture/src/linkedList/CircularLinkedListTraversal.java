package linkedList;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 1/14/2026
 */
public class CircularLinkedListTraversal {
    public static void main(String[] args) {
        Node22 a = new Node22(10);
        Node22 b = new Node22(20);
        Node22 c = new Node22(30);
        Node22 d = new Node22(40);
        Node22 e = new Node22(50);
        Node22 f = new Node22(60);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = a;
        printCircularLinkedList(a);
    }

    private static void printCircularLinkedList(Node22 head) {
        if (head == null) {
            return;
        }
        Node22 current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
    }
}
