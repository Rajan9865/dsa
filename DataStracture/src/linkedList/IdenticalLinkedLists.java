package linkedList;

/**
 * @author Rajan kumar
 * @version 1.0
 * DataStracture
 * @since 7/2/2025
 */
public class IdenticalLinkedLists {
    public static void main(String[] args) {
        Node2 a = new Node2(10);
        Node2 b = new Node2(20);
        Node2 c = new Node2(30);
        a.next = b;
        b.next = c;

        Node2 p = new Node2(10);
        Node2 q = new Node2(20);
        Node2 r = new Node2(30);
        p.next = q;
        q.next = r;
        boolean result = areIdentical(a, p);
        System.out.println("both are idenetical " + result);
    }

    /**
     * @param a
     * @param p
     * @return
     */
    private static boolean areIdentical(Node2 head1, Node2 head2) {
        Node2 current1 = head1;
        Node2 current2 = head2;
        while (current1 != null && current2 != null) {
            if (current1.data != current2.data) {
                return false;
            }
            current1 = current1.next;
            current2 = current2.next;
        }
        return current1 == null && current2 == null;
    }
}

class Node2 {
    int data;
    Node2 next;

    Node2(int data) {
        this.data = data;
    }
}
