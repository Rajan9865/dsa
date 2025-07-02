package linkedList;

import java.time.temporal.Temporal;
import java.util.ArrayList;

/**
 * @author Rajan kumar
 * @version 1.0
 * DataStracture
 * @since 7/2/2025
 */
public class DoublyLinkedListTraversal {
    public static void main(String[] args) {
        Node5 a = new Node5(10);
        Node5 b = new Node5(20);
        Node5 c = new Node5(30);
        Node5 d = new Node5(40);
        a.next = b;
        b.next = c;
        c.next = d;

        b.prev = a;
        c.prev = b;
        d.prev = c;
        ArrayList<Integer> array = toArray(a);
        System.out.println("DLL as Array: " + array);
        System.out.println("print forward");
        printForward(a);
        System.out.println("print backward");
        priintBackward(d);
    }

    private static void priintBackward(Node5 head) {
        Node5 current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    private static void printForward(Node5 head) {
        Node5 current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    private static ArrayList<Integer> toArray(Node5 head) {
        ArrayList<Integer> list = new ArrayList<>();
        Node5 temp = head;
        while (temp != null) {
            list.add(temp.data);
            temp = temp.next;
        }
        return list;
    }
}

class Node5 {
    int data;
    Node5 next, prev;

    Node5(int data) {
        this.data = data;
    }
}
