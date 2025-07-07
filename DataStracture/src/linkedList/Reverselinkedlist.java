package linkedList;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 7/7/2025
 */
public class Reverselinkedlist {
    public static void main(String[] args) {
        Node9 a = new Node9(10);
        Node9 b = new Node9(20);
        Node9 c = new Node9(30);
        Node9 d = new Node9(40);
        Node9 e = new Node9(50);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        Node9 result = reverseList(a);
        printLinkedlist(result);
    }

    private static void printLinkedlist(Node9 result) {
        Node9 temp = result;
        while (temp != null) {
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    private static Node9 reverseList(Node9 head) {
        Node9 prev = null;
        Node9 current = head;
        Node9 next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}

class Node9 {
    int data;
    Node9 next;

    Node9(int data) {
        this.data = data;
    }

}
