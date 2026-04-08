package linkedList;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 2/16/2026
 */
public class RemoveAllDuplicates {
    public static void main(String[] args) {
        Node22 a = new Node22(23);
        Node22 b = new Node22(28);
        Node22 c = new Node22(28);
        Node22 d = new Node22(35);
        Node22 e = new Node22(49);
        Node22 f = new Node22(49);
        Node22 g = new Node22(53);
        Node22 h = new Node22(53);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        Node22 result = removeAllDuplicates(a);
        printlinkedList(result);
    }

    private static Node22 removeAllDuplicates(Node22 head) {
        if (head == null) {
            return null;
        }
        Node22 dummy = new Node22(0);
        dummy.next = head;
        Node22 prev = dummy;
        Node22 curr = head;
        while (curr != null) {
            if (curr.next != null && curr.data == curr.next.data) {
                while (curr.next != null && curr.data == curr.next.data) {
                    curr = curr.next;
                }
                prev.next = curr.next;
            } else {
                prev = prev.next;
            }
            curr = curr.next;
        }
        return dummy.next;
    }

    private static void printlinkedList(Node22 head) {
        Node22 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
