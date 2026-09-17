package top100dsa;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 9/16/2026
 */
public class MergeSortedLinkedListsBruteForce {
    static void main() {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(5);
        a.next = b;
        b.next = c;
        Node a1 = new Node(2);
        Node b1 = new Node(4);
        Node c1 = new Node(6);
        a1.next = b1;
        b1.next = c1;
        Node result = java8Approach(a, a1);
        printlinkedList(result);
    }

    private static void printlinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    private static Node java8Approach(Node head1, Node head2) {
        List<Integer> values = new ArrayList<>();
        values.addAll(tolist(head1));
        values.addAll(tolist(head2));
        List<Integer> collect = values.stream().sorted().collect(Collectors.toList());
        Node dummy = new Node(0);
        Node current = dummy;
        for (Integer i : collect) {
            current.next = new Node(i);
            current = current.next;
        }
        return dummy.next;
    }

    private static List<Integer> tolist(Node head1) {
        List<Integer> values = new ArrayList<>();
        while (head1 != null) {
            values.add(head1.data);
            head1 = head1.next;
        }
        return values;
    }
}
