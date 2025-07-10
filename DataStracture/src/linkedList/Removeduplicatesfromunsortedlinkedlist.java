package linkedList;

import jdk.nashorn.internal.ir.TernaryNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 7/8/2025
 */
public class Removeduplicatesfromunsortedlinkedlist {
    public static void main(String[] args) {
        Node11 a = new Node11(10);
        Node11 b = new Node11(20);
        Node11 c = new Node11(10);
        Node11 d = new Node11(30);
        Node11 e = new Node11(140);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        Node11 result = removeUnsortedNode(a);
        Node11 result1 = removeUnsortedNodeWithExtraSpace(a);
        printLinkedList1(result);
        printLinkedList1(result1);
    }

    private static Node11 removeUnsortedNodeWithExtraSpace(Node11 head) {
        Set<Integer> hashset = new HashSet<>();
        Node11 current = head;
        Node11 prev = null;
        while (current != null) {
            if (hashset.contains(current.data)) {
                prev.next = current.next;
            } else {
                hashset.add(current.data);
                prev = current;
            }
            current = current.next;
        }
        return head;
    }

    private static void printLinkedList1(Node11 head) {
        Node11 temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    private static Node11 removeUnsortedNode(Node11 head) {
        Node11 current = head;
        while (current != null) {
            Node11 temp = current;
            while (temp.next != null) {
                if (temp.next.data == current.data) {
                    temp.next = temp.next.next;
                } else {
                    temp = temp.next;
                }
            }
            current = current.next;
        }
        return head;
    }
}

class Node11 {
    int data;
    Node11 next;

    Node11(int data) {
        this.data = data;
    }
}
