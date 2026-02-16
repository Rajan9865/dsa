package linkedList;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 2/11/2026
 */
public class SwapKthNodes {
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
        int k = 1;
        printLinkedList(a);
        System.out.println();
        a = swapKth(a, k);
        printLinkedList(a);
    }

    private static Node22 swapKth(Node22 head, int k) {
        if (head == null) {
            return head;
        }
        int count = 0;
        Node22 temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        if (k > count) {
            return head;
        }
        if (2 * k - 1 == count) {
            return head;
        }
        Node22 x = head;
        Node22 prevx = null;
        for (int i = 1; i < k; i++) {
            prevx = x;
            x = x.next;
        }
        Node22 y = head;
        Node22 prevY = null;
        for (int i = 1; i < count - k + 1; i++) {
            prevY = y;
            y = y.next;
        }
        if (prevx != null) {
            prevx.next = y;
        }
        if (prevY != null) {
            prevY.next = x;
        }
        Node22 tempNext = x.next;
        x.next = y.next;
        y.next = tempNext;
        if (k == 1) {
            head = y;
        }
        if (k == count) {
            head = x;
        }
        return head;
    }

    private static void printLinkedList(Node22 head) {
        Node22 temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-");
            temp = temp.next;
        }
        System.out.print("null");
    }
}
