package linkedList;


/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 2/10/2026
 */
public class MergeTwoSortedLists {
    public static void main(String[] args) {
        Node22 a = new Node22(2);
        Node22 b = new Node22(5);
        Node22 c = new Node22(10);
        Node22 d = new Node22(15);
        a.next = b;
        b.next = c;
        c.next = d;

        Node22 a1 = new Node22(3);
        Node22 b1 = new Node22(20);
        Node22 c1 = new Node22(40);
        a1.next = b1;
        b1.next = c1;
        Node22 mergedHead = sortedMerge(a, a1);
        print(mergedHead);
    }

    private static void print(Node22 mergedHead) {
        Node22 temp = mergedHead;
        while (temp != null) {
            System.out.print(temp.data + " -");
            temp = temp.next;
        }
        System.out.println("null");
    }

    private static Node22 sortedMerge(Node22 head1, Node22 head2) {
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
