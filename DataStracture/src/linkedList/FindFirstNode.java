package linkedList;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 1/7/2026
 */
public class FindFirstNode {
    public static void main(String[] args) {
        Node22 a = new Node22(1);
        Node22 b = new Node22(2);
        Node22 c = new Node22(3);
        Node22 d = new Node22(4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = a;
        int result = findFirstNode(a);
//        printLinkedList(result);
        System.out.println(result);
    }

    private static void printLinkedList(Node22 head) {
        Node22 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    private static int findFirstNode(Node22 head) {
        if (head == null || head.next == null) {
            return -1;
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
        if (fast == null || fast.next == null) {
            return -1;
        }
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow.data;
    }
}
