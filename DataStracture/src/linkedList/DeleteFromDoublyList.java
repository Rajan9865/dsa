package linkedList;

/**
 * Deletes a node from a doubly linked list at a given position.
 */
public class DeleteFromDoublyList {
    public static void main(String[] args) {
        Node15 head = createLinkedlist();
        int pos = 3;
        head = deleteAtPosition(head, pos);
        printLinkedlist(head);
    }

    private static void printLinkedlist(Node15 head) {
        Node15 current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    private static Node15 deleteAtPosition(Node15 head, int pos) {
        if (head == null || pos <= 0) {
            return head;
        }
        if (pos == 1) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return head;
        }
        Node15 current = head;
        int count = 1;
        while (current != null && count < pos) {
            current = current.next;
            count++;
        }
        if (current == null) {
            return head; // Position out of bounds
        }
        if (current.prev != null) {
            current.prev.next = current.next;
        }
        if (current.next != null) {
            current.next.prev = current.prev;
        }
        return head;
    }

    // Creates and returns a sample doubly linked list: 10 -> 20 -> 30 -> 40
    private static Node15 createLinkedlist() {
        Node15 a = new Node15(10);
        Node15 b = new Node15(20);
        Node15 c = new Node15(30);
        Node15 d = new Node15(40);

        a.next = b;
        b.next = c;
        c.next = d;

        b.prev = a;
        c.prev = b;
        d.prev = c;
        return a;
    }
}

class Node15 {
    int data;
    Node15 prev, next;

    Node15(int data) {
        this.data = data;
    }
}
