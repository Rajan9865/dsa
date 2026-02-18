package linkedList;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 2/17/2026
 */
public class Rearrange {
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
        Node22 result = rearrange(a);
        printlinkedList(result);

    }

    private static void printlinkedList(Node22 head) {
        Node22 temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-");
            temp = temp.next;
        }
        System.out.println("null");
    }

    private static Node22 rearrange(Node22 head) {
        if (head == null || head.next == null)
            return head;
        Node22 odd = head;
        Node22 even = head.next;
        Node22 evenHead = even;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}
