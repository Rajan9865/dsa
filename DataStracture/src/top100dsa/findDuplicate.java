package top100dsa;

import java.util.LinkedList;
import java.util.List;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 9/21/2026
 */
public class findDuplicate {
    static void main() {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(3);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        List<Integer> result = findDuplicateNumber(a);
        System.out.println("Duplicate result: " + result);
    }

    private static List<Integer> findDuplicateNumber(Node head) {
        List<Integer> duplicates = new LinkedList<>();
        Node current = head;
        while (current != null) {
            Node runner = current.next;
            while (runner != null) {
                if (current.data == runner.data) {
                    if (!duplicates.contains(runner.data)) {
                        duplicates.add(runner.data);
                    }
                    break;
                }
                runner = runner.next;
            }
            current = current.next;
        }
        return duplicates;
    }
}
