package linkedList;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 2/11/2026
 */
public class DeleteNAfterM {
    public static void main(String[] args) {
        Node22 a = new Node22(1);
        Node22 b = new Node22(2);
        Node22 c = new Node22(3);
        Node22 d = new Node22(4);
        Node22 e = new Node22(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        int m = 2, n = 1;
        a = deleteNode(a, m, n);
        printLinkedList(a);

    }

    private static Node22 deleteNode(Node22 head, int m, int n) {
        Node22 curr = head;
        while (curr != null) {
            for (int i = 1; i < m && curr != null; i++) {
                curr = curr.next;
            }
            System.out.println(curr.data);
            if (curr == null) {
                break;
            }
            Node22 temp = curr.next;
            for (int i = 0; i < n && temp != null; i++) {
                temp = temp.next;
            }
            System.out.println(temp.data);
            curr.next = temp;
            curr = temp;
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
