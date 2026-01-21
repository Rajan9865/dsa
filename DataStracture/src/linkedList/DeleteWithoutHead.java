package linkedList;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 1/21/2026
 */
public class DeleteWithoutHead {
    public static void main(String[] args) {
        Node22 a = new Node22(10);
        Node22 b = new Node22(20);
        Node22 c = new Node22(30);
        Node22 d = new Node22(40);
        Node22 e = new Node22(50);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        deleteNode(c);
        printLinkedList(a);
    }

    private static void printLinkedList(Node22 head) {
        Node22 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    private static void deleteNode(Node22 del_node) {
        del_node.data = del_node.next.data;
        del_node.next = del_node.next.next;
    }
}
