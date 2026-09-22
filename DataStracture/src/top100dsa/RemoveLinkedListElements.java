package top100dsa;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 9/22/2026
 */
public class RemoveLinkedListElements {
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
//        Node a = new Node(3);
//        Node b = new Node(3);
//        Node c = new Node(4);
//        a.next = b;
//        b.next = c;
        int val = 3;
        Node result = removeElement(a, val);
        printLinkedList(result);
    }

    private static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    private static Node removeElement(Node head, int number) {
        while (head != null && head.data == number) {
            head = head.next;
        }
        Node current = head;
        while (current != null && current.next != null) {
            if (current.next.data == number) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}
