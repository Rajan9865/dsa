package linkedList;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 7/16/2025
 */
public class CheckIfCircularLinkedList {
    public static void main(String[] args) {
        Node17 head = createLinkedList();
        boolean result = isCircularLinkedList(head);
        System.out.println("is circular linkedlist - " + result);
    }

    private static boolean isCircularLinkedList(Node17 head) {
        if (head == null) {
            return false;
        }
        Node17 slow = head;
        Node17 fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    private static Node17 createLinkedList() {
        Node17 a = new Node17(10);
        Node17 b = new Node17(20);
        Node17 c = new Node17(30);
        Node17 d = new Node17(40);
        Node17 e = new Node17(50);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = a;
        return a;
    }
}

class Node17 {
    int data;
    Node17 next;

    Node17(int data) {
        this.data = data;
    }
}
