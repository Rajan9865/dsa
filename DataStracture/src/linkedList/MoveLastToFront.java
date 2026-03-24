package linkedList;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 2/2/2026
 */
public class MoveLastToFront {
    public static void main(String[] args) {
        Node22 a = new Node22(1);
        Node22 b = new Node22(2);
        Node22 c = new Node22(3);
        Node22 d = new Node22(4);
        a.next = b;
        b.next = c;
        c.next = d;
        a = moveToFront(a);
        printList(a);
    }

    private static void printList(Node22 head) {
        Node22 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -");
            temp = temp.next;
        }
        System.out.println("null");
    }

    private static Node22 moveToFront(Node22 head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node22 secondLast = null;
        Node22 last = head;
        while (last.next != null) {
            secondLast = last;
            last = last.next;
        }
        secondLast.next = null;
        last.next = head;
        head = last;
        return head;
    }
}
