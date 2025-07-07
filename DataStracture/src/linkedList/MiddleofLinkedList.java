package linkedList;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 7/7/2025
 */
public class MiddleofLinkedList {
    public static void main(String[] args) {
        Node8 a = new Node8(10);
        Node8 b = new Node8(20);
        Node8 c = new Node8(30);
        Node8 d = new Node8(40);
        Node8 e = new Node8(50);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        int result = getMiddle(a);
        System.out.println("middle element are " + result);
    }

    private static int getMiddle(Node8 head) {
        if (head == null)
            return -1;
        Node8 slow = head;
        Node8 fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;

    }
}

class Node8 {
    int data;
    Node8 next;

    Node8(int data) {
        this.data = data;
    }
}