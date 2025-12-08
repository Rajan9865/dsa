package linkedList;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 11/28/2025
 */
public class RemoveLoopFromLinkedList {
    public static void main(String[] args) {
        Node19 a = new Node19(10);
        Node19 b = new Node19(20);
        Node19 c = new Node19(30);
        Node19 d = new Node19(40);
        Node19 e = new Node19(50);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = c;
        removeLoop(a);
        printLinkedList(a);
    }

    private static void printLinkedList(Node19 head) {
        Node19 temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    private static void removeLoop(Node19 head) {
        if (head == null || head.next == null) return;
        Node19 slow = head;
        Node19 fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) break;
        }
        if (fast == null || fast.next == null) return;
        slow = head;
        if (slow == fast) {
            while (fast.next != slow) {
                fast = fast.next;
            }
            fast.next = null;
            return;
        }
        while (slow.next != fast.next) {
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = null;
    }
}

class Node19 {
    int data;
    Node19 next;

    Node19(int data) {
        this.data = data;
    }
}
