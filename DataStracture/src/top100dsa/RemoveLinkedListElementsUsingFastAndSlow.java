package top100dsa;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 9/22/2026
 */
public class RemoveLinkedListElementsUsingFastAndSlow {
    static void main() {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(4);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        int val = 4;
        Node result = removeLinkedListElement(val, a);
        printLinkedList(result);
    }

    private static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    private static Node removeLinkedListElement(int number, Node head) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node previous = dummy;
        Node current = head;
        while (current != null) {
            if (current.data == number) {
                previous.next = current.next;
            } else {
                previous = current;
            }
            current = current.next;
        }
        return dummy.next;
    }
}
