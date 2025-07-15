package linkedList;


/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 7/15/2025
 */
public class ReverseDoublyLinkedList {
    public static void main(String[] args) {
        Node16 head = createLinkedlist();
        Node16 result = reverseLinkedList(head);
        printLinkedList(result);
    }

    private static void printLinkedList(Node16 result) {
        Node16 temp = result;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    private static Node16 reverseLinkedList(Node16 head) {
        Node16 current = head;
        Node16 temp = null;
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        if (temp != null) {
            head = temp.prev;
        }
        return head;
    }

    private static Node16 createLinkedlist() {
        Node16 a = new Node16(10);
        Node16 b = new Node16(20);
        Node16 c = new Node16(30);
        Node16 d = new Node16(40);
        Node16 e = new Node16(50);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        b.prev = a;
        c.prev = b;
        d.prev = c;
        e.prev = d;
        return a;
    }
}

class Node16 {
    int data;
    Node16 next, prev;

    Node16(int data) {
        this.data = data;
    }
}
