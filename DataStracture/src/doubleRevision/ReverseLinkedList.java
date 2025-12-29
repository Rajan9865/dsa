package doubleRevision;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 12/29/2025
 */
public class ReverseLinkedList {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        Node result = reverseLinkedList(a);
        printlinkedList(result);
    }

    private static void printlinkedList(Node result) {
        Node temp = result;
        while (temp != null) {
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    private static Node reverseLinkedList(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}
