package linkedList;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 1/13/2026
 */
public class DeleteMiddle {
    public static void main(String[] args) {
        Node22 a = new Node22(10);
        Node22 b = new Node22(20);
        Node22 c = new Node22(30);
        Node22 d = new Node22(40);
        Node22 e = new Node22(50);
//        Node22 f = new Node22(60);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
//        e.next = f;
        Node22 result = deleteMiddle(a);
        printLinkedList(result);
    }

    private static void printLinkedList(Node22 head) {
        Node22 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    private static Node22 deleteMiddle(Node22 head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node22 slow = head;
        Node22 fast = head;
        Node22 prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;
        return head;
    }
}
