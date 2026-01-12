package linkedList;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 1/9/2026
 */
public class DeleteLastOccurrence {
    public static void main(String[] args) {
        Node22 a = new Node22(1);
        Node22 b = new Node22(2);
        Node22 c = new Node22(3);
        Node22 d = new Node22(1);
        Node22 e = new Node22(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        int key = 1;
        Node22 result = deleteLastOccurrence(a, key);
        printLinkedList(result);
    }

    private static void printLinkedList(Node22 head) {
        Node22 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    private static Node22 deleteLastOccurrence(Node22 head, int key) {
        if (head == null) {
            return null;
        }
        Node22 current = head;
        Node22 previous = null;
        Node22 lastNode = null;
        Node22 lastPrevious = null;
        while (current != null) {
            if (current.data == key) {
                lastNode = current;
                lastPrevious = previous;
            }
            previous = current;
            current = current.next;
        }
        if (lastNode == null) {
            return head;
        }
        if (lastPrevious == null) {
            head = head.next;
        } else {
            lastPrevious.next = lastNode.next;
        }
        return head;
    }
}
