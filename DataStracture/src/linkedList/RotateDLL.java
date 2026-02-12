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
        if (head == null || p == 0)
            return head;
        NodeDouble curr = head;
        int count = 1;
        while (count < p && curr != null) {
            curr = curr.next;
            count++;
        }
        if (curr == null) return head;
        NodeDouble newHead = curr.next;
        if (newHead == null) return head;
        newHead.prev = null;
        curr.next = null;
        NodeDouble tail = newHead;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = head;
        head.prev = tail;
        return newHead;
    }
}
