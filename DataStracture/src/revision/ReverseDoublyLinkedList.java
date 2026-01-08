package revision;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 1/7/2026
 */
public class ReverseDoublyLinkedList {
    public static void main(String[] args) {
        Node23 a = new Node23(1);
        Node23 b = new Node23(2);
        Node23 c = new Node23(3);
        Node23 d = new Node23(4);
        a.next = b;
        b.next = c;
        c.next = d;

        b.prev = a;
        c.prev = b;
        d.prev = c;
        Node23 result = reverseDLL(a);
        printLinkedList(result);
    }

    private static void printLinkedList(Node23 head) {
        
    }

    private static Node23 reverseDLL(Node23 head) {

    }
}
