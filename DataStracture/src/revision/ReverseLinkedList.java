package revision;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 12/19/2025
 */
public class ReverseLinkedList {
    public static void main(String[] args) {
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
        e.next = f;

        Node result = reverseLinkedList(a);
        printLinkedList(result);
    }

    /**
     * @param result
     */
    private static void printLinkedList(Node result) {
        Node reversed = result;
        while (reversed != null) {
            System.out.print(reversed.data + " -> ");
            reversed = reversed.next;
        }
        System.out.println("null");
    }

    /**
     *
     * @param head
     * @return
     */
    private static Node reverseLinkedList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}

/**
 * create a object of class
 */
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}
