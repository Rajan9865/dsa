package linkedList;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 2/3/2026
 */
public class ReverseBothParts {
    public static void main(String[] args) {
        Node22 a = new Node22(1);
        Node22 b = new Node22(2);
        Node22 c = new Node22(3);
        Node22 d = new Node22(4);
        Node22 e = new Node22(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        int k = 2;
        Node22 result = reverseBothParts(a, k);
        printLinkedList(result);
    }

    private static void printLinkedList(Node22 head) {
        Node22 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -");
            temp = temp.next;
        }
        System.out.println("null");
    }

    private static Node22 reverseBothParts(Node22 head, int k) {
        if (head == null || k == 0) {
            return head;
        }
        Node22 current = head;
        Node22 previous = null;
        int count = 0;
        while (current != null && count < k) {
            previous = current;
            current = current.next;
            count++;
        }
        previous.next = null;
        Node22 firstpart = reverseLinkedList(head);
        Node22 secondpart = reverseLinkedList(current);
        head.next = secondpart;
        return firstpart;
    }

    private static Node22 reverseLinkedList(Node22 head) {
        Node22 prev = null;
        Node22 curr = head;
        while (curr != null) {
            Node22 next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
