package revision;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 12/19/2025
 */
public class ReverseLinkedListRecursiveApproach {
    public static void main(String[] args) {
        Node1 node1 = new Node1(1);
        Node1 node2 = new Node1(2);
        Node1 node3 = new Node1(3);
        Node1 node4 = new Node1(4);
        Node1 node5 = new Node1(5);
        Node1 node6 = new Node1(6);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        Node1 result = reverseLinkedListUsingApproach(node1);
        printLinkedList(result);

    }

    private static void printLinkedList(Node1 result) {
        Node1 temp = result;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    private static Node1 reverseLinkedListUsingApproach(Node1 head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node1 newHead = reverseLinkedListUsingApproach(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}

class Node1 {
    int data;
    Node1 next;

    public Node1(int data) {
        this.data = data;
    }
}
