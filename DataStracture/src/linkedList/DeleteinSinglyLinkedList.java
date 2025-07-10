package linkedList;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 7/9/2025
 */
public class DeleteinSinglyLinkedList {
    public static void main(String[] args) {
        Node13 head = createLinkedList();
        int x = 1;
        Node13 result = deleteNode(head, x);
        printLinkedlist(result);
    }

    private static void printLinkedlist(Node13 head) {
        Node13 current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    private static Node13 deleteNode(Node13 head, int number) {
        if (number == 1) {
            return head.next;

        }
        Node13 temp = head;
        int count = 1;
        while (temp != null && count < number - 1) {
            temp = temp.next;
            count++;
        }
        temp.next = temp.next.next;
        return head;
    }

    private static Node13 createLinkedList() {
        Node13 a = new Node13(10);
        Node13 b = new Node13(20);
        Node13 c = new Node13(100);
        Node13 d = new Node13(101);
        a.next = b;
        b.next = c;
        c.next = d;
        return a;
    }
}

class Node13 {
    int data;
    Node13 next;

    Node13(int data) {
        this.data = data;
    }
}