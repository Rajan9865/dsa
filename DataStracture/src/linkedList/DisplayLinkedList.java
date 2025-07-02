package linkedList;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lenovo
 * @version 1.0
 * DataStracture
 * @since 7/2/2025
 */
public class DisplayLinkedList {
    public static void main(String[] args) {
        Node3 a = new Node3(10);
        Node3 b = new Node3(10);
        Node3 c = new Node3(10);
        Node3 d = new Node3(10);
        a.next = b;
        b.next = c;
        c.next = d;
        ArrayList<Integer> result = displayList(a);
        printList(result);
    }

    private static void printList(ArrayList<Integer> result) {
        result.forEach(s -> System.out.print(s + " "));
    }

    private static ArrayList<Integer> displayList(Node3 head) {
        Node3 temp = head;
        ArrayList<Integer> list = new ArrayList<>();
        while (temp != null) {
            list.add(temp.data);
            temp = temp.next;
        }
        return list;
    }
}

class Node3 {
    int data;
    Node3 next;

    Node3(int data) {
        this.data = data;
    }
}