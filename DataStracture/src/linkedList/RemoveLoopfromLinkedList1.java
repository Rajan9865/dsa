package linkedList;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 1/5/2026
 */
public class RemoveLoopfromLinkedList1 {
    public static void main(String[] args) {
        Node22 a = new Node22(1);
        Node22 b = new Node22(2);
        Node22 c = new Node22(3);
        Node22 d = new Node22(4);
        Node22 e = new Node22(5);
        Node22 f = new Node22(6);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        e.next = c;
        removeLoopfromLinkedList1(a);
        printLinkedList(a);
    }

    private static void printLinkedList(Node22 head) {
        Node22 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    private static void removeLoopfromLinkedList1(Node22 head) {
        if (head == null || head.next == null) {
            return;
        }
        Node22 slow = head;
        Node22 fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }
        // no loop detect
        if (slow != fast) {
            return;
        }
        slow = head;
        while (slow.next != fast.next) {
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = null;
    }
}
