package linkedList;

/**
 * @author lenovo
 * @version 1.0
 * DataStracture
 * @since 7/2/2025
 */
public class InsertinMiddleofLinkedList {
    public static void main(String[] args) {
        Node6 a = new Node6(10);
        Node6 b = new Node6(20);
        Node6 c = new Node6(30);
//        Node6 d = new Node6(40);
        a.next = b;
        b.next = c;
//        c.next = d;
        int x = 90;
        Node6 result = insertInMiddle(a, x);
        printlinkedList(result);
    }

    private static Node6 insertInMiddle(Node6 head, int x) {
        Node6 node = new Node6(x);
        if (head == null) {
            return node;
        }
        if (head.next == null) {
            head.next = node;
            return head;
        }
        Node6 slow = head;
        Node6 fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        node.next = slow.next;
        slow.next = node;
        return head;
    }

    private static void printlinkedList(Node6 head) {
        Node6 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

class Node6 {
    int data;
    Node6 next;

    Node6(int data) {
        this.data = data;
    }
}
