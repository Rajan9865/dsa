package linkedList;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 7/16/2025
 */
public class RemoveNodesWithGreaterRight {
    public static void main(String[] args) {
        Node18 head = createLinkedList();
        head = removeNodes(head);
        printLinkedList(head);
    }

    private static void printLinkedList(Node18 head) {
        Node18 current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    private static Node18 createLinkedList() {
        Node18 a = new Node18(12);
        Node18 b = new Node18(15);
        Node18 c = new Node18(10);
        Node18 d = new Node18(11);
        Node18 e = new Node18(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        return a;
    }

    private static Node18 removeNodes(Node18 head) {
        head = reverse(head);
        Node18 current = head;
        int max = current.data;
        while (current != null && current.next != null) {
            if (current.next.data < max) {
                current.next = current.next.next;
            } else {
                current = current.next;
                max = current.data;
            }
        }
        return reverse(head);
    }

    private static Node18 reverse(Node18 head) {
        Node18 prev = null;
        Node18 current = head;
        while (current != null) {
            Node18 next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}

class Node18 {
    int data;
    Node18 next;

    Node18(int data) {
        this.data = data;
    }
}