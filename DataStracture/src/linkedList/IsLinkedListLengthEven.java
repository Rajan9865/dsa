package linkedList;

import javax.crypto.Cipher;

/**
 * @author lenovo
 * @version 1.0
 * DataStracture
 * @since 7/2/2025
 */
public class IsLinkedListLengthEven {
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(10);
        Node c = new Node(10);
        Node d = new Node(10);
        Node e = new Node(10);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        boolean result = isLengthEven(a);
        System.out.println(" even " + result);
    }

    private static boolean isLengthEven(Node head) {
        Node current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        System.out.println(count);
        if (count % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}

class Node {
    int data;
    Node next;

    /**
     * @param data
     */
    Node(int data) {
        this.data = data;
    }
}
