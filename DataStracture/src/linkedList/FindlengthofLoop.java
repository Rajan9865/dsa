package linkedList;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 7/9/2025
 */
public class FindlengthofLoop {
    public static void main(String[] args) {
        Node12 head = createLinkedList();
        int loopLength = countNodesInLoop(head);
        System.out.println(loopLength);
    }

    private static int countNodesInLoop(Node12 head) {
        Node12 slow = head;
        Node12 fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return countLoopLength(slow);
            }
        }
        return 0;
    }

    private static int countLoopLength(Node12 mtPoint) {
        Node12 current = mtPoint;
        int count = 1;
        while (current.next != mtPoint) {
            current = current.next;
            count++;
        }
        return count;
    }

    private static Node12 createLinkedList() {
        Node12 a = new Node12(10);
        Node12 b = new Node12(20);
        Node12 c = new Node12(30);
        Node12 d = new Node12(40);
        Node12 e = new Node12(50);
        Node12 f = new Node12(60);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        f.next = c;
        return a;
    }
}

class Node12 {
    int data;
    Node12 next;

    Node12(int data) {
        this.data = data;
    }
}
