package linkedList;

/**
 * @author Rajan kumar
 * @version 1.0
 * DataStracture
 * @since 7/2/2025
 */
public class SearchInLinkedList {
    public static void main(String[] args) {
        Node4 a = new Node4(10);
        Node4 b = new Node4(20);
        Node4 c = new Node4(30);
        Node4 d = new Node4(40);
        a.next = b;
        b.next = c;
        c.next = d;
        int x = 40;
        boolean result = searchLinkedList(a, x);
        System.out.println(result ? "node are found" : "node are not found");
    }

    private static boolean searchLinkedList(Node4 head, int target) {
        Node4 temp = head;
        while (temp != null) {
            if (temp.data == target) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}

class Node4 {
    int data;
    Node4 next;

    Node4(int data) {
        this.data = data;
    }
}
