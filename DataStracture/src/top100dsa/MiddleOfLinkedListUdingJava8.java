package top100dsa;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 9/17/2026
 */
public class MiddleOfLinkedListUdingJava8 {
    static void main() {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        Node result = findMiddle(a);
        System.out.println("middle node is " + result.data);
    }

    private static Node findMiddle(Node head) {
        List<Integer> values = new ArrayList<>();
        Node current = head;
        while (current != null) {
            values.add(current.data);
            current = current.next;
        }
        int middle = values.size() / 2;
        return IntStream.range(0, values.size()).filter(i -> i == middle)
                .mapToObj(i -> new Node(values.get(i)))
                .collect(Collectors.toList()).get(0);
    }
}
