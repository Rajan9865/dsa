package linkedList;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 2/16/2026
 */
public class partitionLinkedListGivenData {
    public static void main(String[] args) {
        Node22 a = new Node22(1);
        Node22 b = new Node22(4);
        Node22 c = new Node22(3);
        Node22 d = new Node22(2);
        Node22 e = new Node22(5);
        Node22 f = new Node22(2);
        Node22 g = new Node22(3);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        int x = 3;
        Node22 result = partition(a, x);
        printlinkedList(result);
    }

    private static void printlinkedList(Node22 head) {
        Node22 temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-");
            temp = temp.next;
        }
        System.out.print("null");
    }

    private static Node22 partition(Node22 head, int x) {
        Node22 lessHead = new Node22(0);
        Node22 less = lessHead;
        Node22 equalHead = new Node22(0);
        Node22 equal = equalHead;
        Node22 greaterHead = new Node22(0);
        Node22 greater = greaterHead;

        Node22 curr = head;

        while (curr != null) {

            if (curr.data < x) {
                less.next = curr;
                less = less.next;
            } else if (curr.data == x) {
                equal.next = curr;
                equal = equal.next;
            } else {
                greater.next = curr;
                greater = greater.next;
            }

            curr = curr.next;
        }

        // Important: end the greater list
        greater.next = null;

        // Connect lists
        equal.next = greaterHead.next;
        less.next = equalHead.next;

        return lessHead.next;
    }
}
