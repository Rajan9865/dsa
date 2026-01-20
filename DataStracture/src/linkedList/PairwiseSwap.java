package linkedList;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 1/20/2026
 */
public class PairwiseSwap {
    public static void main(String[] args) {
        Node22 a = new Node22(10);
        Node22 b = new Node22(20);
        Node22 c = new Node22(30);
        Node22 d = new Node22(40);
        Node22 e = new Node22(50);
        Node22 f = new Node22(60);
        Node22 g = new Node22(70);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        Node22 result = pairwiseSwap(a);
        printLinkedList(result);

    }

    private static void printLinkedList(Node22 result) {
        Node22 temp = result;
        while (temp != null) {
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    private static Node22 pairwiseSwap(Node22 head) {
        if (head == null) {
            return null;
        }
        Node22 current = head;
//        int temp = 0;
        while (current != null && current.next != null) {
            // swap the data using third variable
            int temp = current.data;
            current.data = current.next.data;
            current.next.data = temp;

            //and move the pointer to next two nodes
            current = current.next.next;
        }
        return head;
    }
}
