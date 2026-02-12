package linkedList;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 2/11/2026
 */
public class RotateDLL {
    public static void main(String[] args) {
        NodeDouble a = new NodeDouble(20);
        NodeDouble b = new NodeDouble(30);
        NodeDouble c = new NodeDouble(40);
        NodeDouble d = new NodeDouble(50);
        NodeDouble e = new NodeDouble(60);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        b.prev = a;
        c.prev = b;
        d.prev = c;
        e.prev = d;
        int p = 2;
        a = rotate(a, p);
        printlinkedList(a);
    }

    private static void printlinkedList(NodeDouble head) {
        NodeDouble temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    private static NodeDouble rotate(NodeDouble head, int p) {
        if (head == null || p == 0) return head;

        NodeDouble curr = head;
        int length = 1;

        // Find length and tail in one traversal
        while (curr.next != null) {
            curr = curr.next;
            length++;
        }

        NodeDouble tail = curr;

        p = p % length;
        if (p == 0) return head;

        curr = head;
        for (int i = 1; i < p; i++) {
            curr = curr.next;
        }

        NodeDouble newHead = curr.next;

        // Break the list
        curr.next = null;
        newHead.prev = null;

        // Connect tail to head
        tail.next = head;
        head.prev = tail;

        return newHead;
    }
}
