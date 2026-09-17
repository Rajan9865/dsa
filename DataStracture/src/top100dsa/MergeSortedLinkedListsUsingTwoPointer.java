package top100dsa;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 9/16/2026
 */
public class MergeSortedLinkedListsUsingTwoPointer {
    static void main() {
        Node a = new Node(1);
        Node b = new Node(3);
        Node c = new Node(5);
        a.next = b;
        b.next = c;
        Node a1 = new Node(3);
        Node b1 = new Node(5);
        Node c1 = new Node(6);
        a1.next = b1;
        b1.next = c1;
        Node result = mergeLinkedList(a, a1);
        Node resultForDuplicate = mergeLinkedListAndRemoveDuplicate(a, a1);
        System.out.println("merged linked list");
        printlinkedList(result);
        System.out.println("merged linked list and remove duplicate");
        printlinkedList(resultForDuplicate);
    }

    private static Node mergeLinkedListAndRemoveDuplicate(Node head1, Node head2) {
        Node dummy = new Node(0);
        Node current = dummy;
        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                current.next = head1;
                head1 = head1.next;
            } else if (head2.data < head1.data) {
                current.next = head2;
                head2 = head2.next;
            } else {
                current.next = head1;
                head1 = head1.next;
                head2 = head2.next;
            }
            current = current.next;
        }
        if (head1 != null) {
            current.next = head1;
        }
        if (head2 != null) {
            current.next = head2;
        }
        return dummy.next;
    }

    private static void printlinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    private static Node mergeLinkedList(Node head1, Node head2) {
        Node dummy = new Node(0);
        Node head = dummy;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                head.next = head1;
                head1 = head1.next;
            } else {
                head.next = head2;
                head2 = head2.next;
            }
            head = head.next;
        }
        if (head1 != null) {
            head.next = head1;
        }
        if (head2 != null) {
            head.next = head2;
        }
        return dummy.next;
    }
}
