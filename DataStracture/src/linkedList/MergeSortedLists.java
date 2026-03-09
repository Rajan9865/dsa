package linkedList;


/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 1/21/2026
 */
public class MergeSortedLists {
    public static void main(String[] args) {
        Node22 a = new Node22(10);
        Node22 b = new Node22(20);
        Node22 c = new Node22(30);
        Node22 d = new Node22(40);
        a.next = b;
        b.next = c;
        c.next = d;

        Node22 a1 = new Node22(15);
        Node22 a2 = new Node22(25);
        Node22 a3 = new Node22(35);
        Node22 a4 = new Node22(80);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;

        Node22 result = sortedMerge(a, a1);
        printlinkedList(result);
    }

    private static void printlinkedList(Node22 head) {
        Node22 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    private static Node22 sortedMerge(Node22 head1, Node22 head2) {
        if (head1 == null && head2 == null) {
            return null;
        }
        Node22 dummy = new Node22(0);
        Node22 tail = dummy;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }
        if (head1 != null) {
            tail.next = head1;
        } else {
            tail.next = head2;
        }
        return dummy.next;
    }
}
