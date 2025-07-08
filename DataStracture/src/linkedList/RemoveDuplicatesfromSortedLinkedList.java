package linkedList;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 7/8/2025
 */
public class RemoveDuplicatesfromSortedLinkedList {
    public static void main(String[] args) {
        Node10 a = new Node10(10);
        Node10 b = new Node10(20);
        Node10 c = new Node10(30);
        Node10 d = new Node10(30);
        Node10 e = new Node10(40);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        Node10 result = removeDupliacteNode(a);
        printLinkedList(result);
    }

    private static void printLinkedList(Node10 head) {
        Node10 temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    private static Node10 removeDupliacteNode(Node10 head) {
        Node10 temp = head;
        while (temp != null && temp.next != null) {
            if (temp.data == temp.next.data) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return head;
    }
}

class Node10 {
    int data;
    Node10 next;

    Node10(int data) {
        this.data = data;
    }
}
