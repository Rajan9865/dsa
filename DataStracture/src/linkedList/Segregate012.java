package linkedList;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 2/2/2026
 */
public class Segregate012 {
    public static void main(String[] args) {
        Node22 a = new Node22(1);
        Node22 b = new Node22(2);
        Node22 c = new Node22(2);
        Node22 d = new Node22(1);
        Node22 e = new Node22(0);
        Node22 f = new Node22(2);
        Node22 g = new Node22(2);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        a = segregate(a);
        printList(a);

    }

    private static void printList(Node22 head) {
        Node22 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    private static Node22 segregate(Node22 head) {
        if (head == null) {
            return null;
        }
        int count1 = 0;
        int count2 = 0;
        int count0 = 0;
        Node22 current = head;
        while (current != null) {
            if (current.data == 0) {
                count0++;
            } else if (current.data == 1) {
                count1++;
            } else {
                count2++;
            }
            current = current.next;
        }
        current = head;
        while (count0-- > 0) {
            current.data = 0;
            current = current.next;
        }
        while (count1-- > 0) {
            current.data = 1;
            current = current.next;
        }
        while (count2-- > 0) {
            current.data = 2;
            current = current.next;
        }
        return head;
    }
}
