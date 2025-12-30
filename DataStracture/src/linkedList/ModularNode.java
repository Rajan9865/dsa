package linkedList;

/**
 * @author Rajan kumar
 * @version 1.0
 * DataStracture
 * @since 7/2/2025
 */
public class ModularNode {
    public static void main(String[] args) {
        Node1 a = new Node1(1);
        Node1 b = new Node1(2);
        Node1 c = new Node1(3);
        Node1 d = new Node1(4);
        Node1 e = new Node1(5);
        Node1 f = new Node1(6);
        Node1 g = new Node1(7);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        int k = 3;
        int result = modularNode(a, k);
        System.out.println(result);
    }

    private static int modularNode(Node1 head, int k) {
        int index = 1;
        int result = -1;
        Node1 current = head;
        while (current != null) {
            if (index % k == 0) {
                result = current.data;
            }
            current = current.next;
            index++;
        }
        return result;
    }
}

