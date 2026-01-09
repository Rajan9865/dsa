package linkedList;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 1/8/2026
 */
public class RotateLinkedListLeft {
    public static void main(String[] args) {
        Node22 a = new Node22(1);
        Node22 b = new Node22(2);
        Node22 c = new Node22(3);
        Node22 d = new Node22(4);
        Node22 e = new Node22(5);
        a.next = b;
        b.next = c;
        c.next = d;
//        d.next = e;
        int rotate = 3;
        Node22 result = rotate(a, rotate);
        printlInkedList(result);
    }

    /**
     *
     * @param head
     */
    private static void printlInkedList(Node22 head) {
        Node22 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    private static Node22 rotate(Node22 head, int k) {
        if (head == null || k == 0) {
            return head;
        }
        Node22 temp = head;
        int length = 1;
        while (temp.next != null) {
            temp = temp.next;
            length++;
        }
//        k = k % length;
        k %= length;
        if (k == 0) {
            return head;
        }
        temp = head;
        for (int i = 1; i < k; i++) {
            temp = temp.next;
        }
        Node22 newHead = temp.next;
        temp.next = null;

        Node22 current = newHead;
        while (current.next != null) {
            current = current.next;
        }
        current.next = head;
        return newHead;
    }
}
