package doubleRevision;

import linkedList.Node1;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 12/29/2025
 */
public class ReverseLinkedList {
    public static void main(String[] args) {
        Node1 a = new Node1(1);
        Node1 b = new Node1(2);
        Node1 c = new Node1(3);
        Node1 d = new Node1(4);
        Node1 e = new Node1(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
//        Node1 result = reverseLinkedList(a);
//        printlinkedList(result);
        int k = 3;
        Node1 result1 = reverseLinkedListKGroup(a, k);
        printlinkedList(result1);
    }

    private static Node1 reverseLinkedListKGroup(Node1 head, int k) {
        Node1 current = head;
        Node1 prev = null;
        Node1 next = null;
        int count = 0;
        while (current != null && count < k) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }
        if (next != null) {
            head.next = reverseLinkedListKGroup(current, k);
        }
        return prev;
    }

    private static void printlinkedList(Node1 result) {
        Node1 temp = result;
        while (temp != null) {
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    private static Node1 reverseLinkedList(Node1 head) {
        Node1 prev = null;
        Node1 curr = head;
        while (curr != null) {
            Node1 next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}

/*
class Node1 {
    int data;
    Node1 next;

    public Node1(int data) {
        this.data = data;
    }
}
*/