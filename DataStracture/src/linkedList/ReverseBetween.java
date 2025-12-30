package linkedList;

/**
 * @author Rajan
 * @version 1.0
 * Dsa
 * @since 12/29/2025
 */
public class ReverseBetween {
    public static void main(String[] args) {
        Node20 a = new Node20(1);
        Node20 b = new Node20(2);
        Node20 c = new Node20(3);
        Node20 d = new Node20(4);
        Node20 e = new Node20(5);
        Node20 f = new Node20(6);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        int m = 2;
        int n = 4;
        Node20 result = reverseBetween(a, m, n);
        printLinkedList(result);
    }

    private static void printLinkedList(Node20 result) {
        Node20 temp = result;
        while (temp != null) {
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    private static Node20 reverseBetween(Node20 head, int m, int n) {
        Node20 dummy = new Node20(0);
        dummy.next = head;
        Node20 prev = dummy;
        for (int i = 1; i < m; i++) {
            prev = prev.next;
        }
        Node20 curr = prev.next;
        for (int i = 0; i < n - m; i++) {
            Node20 temp = curr.next;
            curr.next = temp.next;
            temp.next = prev.next;
            prev.next = temp;
        }
        return dummy.next;
    }
}

class Node20 {
    int data;
    Node20 next;

    Node20(int data) {
        this.data = data;
    }
}
