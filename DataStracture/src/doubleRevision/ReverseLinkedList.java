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
//        Node result = reverseLinkedList(a);
//        printlinkedList(result);
        int k = 3;
        Node result1 = reverseLinkedListKGroup(a, k);
        printlinkedList(result1);
    }

    private static Node reverseLinkedListKGroup(Node head, int k) {
        Node current = head;
        Node prev = null;
        Node next = null;
        int count = 0;
        while (current != null && count < k) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }
        if (next != null) {
            head.next = reverseLinkedListKGroup(current, k);
        }
        return prev;
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
