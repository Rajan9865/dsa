package revision;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 12/19/2025
 */
public class ReverseKGroup {
    public static void main(String[] args) {
        Node3 a = new Node3(10);
        Node3 b = new Node3(20);
        Node3 c = new Node3(30);
        Node3 d = new Node3(40);
        Node3 e = new Node3(50);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        int k = 3;
        Node3 result = reverseKGroup(a, k);
        printlinkedList(result);
    }

    private static void printlinkedList(Node3 result) {
        Node3 temp = result;
        while (temp != null) {
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    private static Node3 reverseKGroup(Node3 head, int k) {
        Node3 current = head;
        Node3 previous = null;
        Node3 next = null;
        int count = 0;
        while (current != null && count < k) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
            count++;
        }
        if (next != null) {
            head.next = reverseKGroup(current, k);
        }
        return previous;
    }
}

class Node3 {
    int data;
    Node3 next;

    public Node3(int data) {
        this.data = data;
        this.next = null;
    }

}
