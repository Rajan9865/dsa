package linkedList;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 7/10/2025
 */
public class Deletewithoutheadpointer {
    public static void main(String[] args) {
        Node14 head = createNode();
        deletewithoutheadpointer(head);
        printList(head);
    }

    private static void printList(Node14 head) {
        Node14 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    private static void deletewithoutheadpointer(Node14 head) {
        if (head == null || head.next == null) {
            throw new IllegalArgumentException(" can not delete the last node or null node0");
        }
        head.data = head.next.data;
        head.next = head.next.next;
    }

    private static Node14 createNode() {
        Node14 a = new Node14(10);
        Node14 b = new Node14(101);
        Node14 c = new Node14(100);
        Node14 d = new Node14(109);
        a.next = b;
        b.next = c;
        c.next = d;
        return a;
    }
}

class Node14 {
    int data;
    Node14 next;

    Node14(int data) {
        this.data = data;
    }
}
