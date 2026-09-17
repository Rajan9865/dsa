package top100dsa;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 9/17/2026
 */
public class MiddleOfLinkedList {
    static void main() {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        Node result = findMiddleBruteForce(a);
        System.out.println("Middle node is " + result.data);
    }

    private static Node findMiddleBruteForce(Node head) {
        if (head == null)
            return null;
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        int middle = count / 2;
        current = head;
        for (int i = 0; i < middle; i++) {
            current = current.next;
        }
        return current;
    }
}
