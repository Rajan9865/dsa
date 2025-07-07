package linkedList;

/**
 * @author Rajan kumar
 * @version 1.0
 * DataStracture
 * @since 7/3/2025
 */
public class KthfromEndofLinkedList {
    public static void main(String[] args) {
        Node7 a = new Node7(10);
        Node7 b = new Node7(20);
        Node7 c = new Node7(30);
        Node7 d = new Node7(150);
        a.next = b;
        b.next = c;
        c.next = d;
        int k = 1;
        int result = getKthFromLast(a, k);
        System.out.println("kt last mnode " + result);
    }

    private static int getKthFromLast(Node7 head, int k) {
        Node7 slow = head;
        Node7 fast = head;
        for (int i = 0; i < k; i++) {
            if (fast == null) {
                return -1;
            }
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return (slow != null) ? slow.data : -1;
    }
}

class Node7 {
    int data;
    Node7 next;

    Node7(int data) {
        this.data = data;
    }
}
