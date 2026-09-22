package top100dsa;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 9/21/2026
 */
public class reverseNumberusingLinkedlist {
    static void main() {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        a.next = b;
        b.next = c;
        Node resutl = reverseNumber(a);
        printLinkedList(resutl);
    }

    private static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    private static Node reverseNumber(Node head) {
        if (head == null) return null;
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
