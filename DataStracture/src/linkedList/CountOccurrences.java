package linkedList;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 1/15/2026
 */
public class CountOccurrences {
    public static void main(String[] args) {
        Node22 a = new Node22(60);
        Node22 b = new Node22(60);
        Node22 c = new Node22(40);
        Node22 d = new Node22(60);
        Node22 e = new Node22(40);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        int key = 40;
        int result = countOccurrence(a, key);
        System.out.println("count = " + result);
    }

    private static int countOccurrence(Node22 head, int key) {
        if (head == null) {
            return 0;
        }
        int count = 0;
        Node22 current = head;
        while (current != null) {
            if (current.data == key) {
                count++;
            }
            current = current.next;
        }
        return count;
    }
}
