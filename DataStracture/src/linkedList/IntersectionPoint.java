package linkedList;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 1/20/2026
 */
public class IntersectionPoint {
    public static void main(String[] args) {
        Node22 a = new Node22(10);
        Node22 comman = new Node22(15);
        Node22 c = new Node22(30);
        Node22 a1 = new Node22(3);
        Node22 b1 = new Node22(6);
        Node22 c1 = new Node22(9);
        Node22 d1 = new Node22(15);
        Node22 e1 = new Node22(30);
//        a.next = b;
//        b.next = c;
        comman.next = c;
        a.next = comman;

        a1.next = b1;
        b1.next = c1;
        c1.next = comman;
        d1.next = e1;

        Node22 result = intersectPoint(a, a1);
        printNode(result);
    }

    private static void printNode(Node22 head) {
        System.out.println(head.data);
    }

    private static Node22 intersectPoint(Node22 head1, Node22 head2) {
        int length1 = getLength(head1);
        int length2 = getLength(head2);
        int diff = Math.abs(length1 - length2);
        if (length1 > length2) {
            for (int i = 0; i < diff; i++) {
                head1 = head1.next;
            }
        } else
            for (int i = 0; i < diff; i++) {
                head2 = head2.next;
            }
        while (head1 != null && head2 != null) {
            if (head1 == head2) {
                return head1;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return null;
    }

    private static int getLength(Node22 head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }
}
