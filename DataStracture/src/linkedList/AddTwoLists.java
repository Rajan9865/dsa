package linkedList;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 2/9/2026
 */
public class AddTwoLists {
    public static void main(String[] args) {
        Node22 a = new Node22(1);
        Node22 b = new Node22(2);
        Node22 c = new Node22(3);
        Node22 a1 = new Node22(4);
        Node22 b1 = new Node22(5);
        Node22 c1 = new Node22(6);
        a.next = b;
        b.next = c;

        a1.next = b1;
        b1.next = c1;
        Node22 result = addTwoLists(a, a1);
        printLinkedList(result);
    }

    private static Node22 addTwoLists(Node22 head1, Node22 head2) {
        head1 = reverse(head1);
        head2 = reverse(head2);
        Node22 dummy = new Node22(0);
        Node22 temp = dummy;
        int carry = 0;
        while (head1 != null || head2 != null || carry != 0) {
            int sum = carry;
            if (head1 != null) {
                sum += head1.data;
                head1 = head1.next;
            }
            if (head2 != null) {
                sum += head2.data;
                head2 = head2.next;
            }
            carry = sum / 10;
            temp.next = new Node22(sum % 10);
            temp = temp.next;
        }
        Node22 result = reverse(dummy.next);
        while (result != null && result.data == 0) {
            result = result.next;
        }
        return result == null ? new Node22(0) : result;
    }

    private static Node22 reverse(Node22 head) {
        if (head == null) {
            return null;
        }
        Node22 prev = null;
        Node22 curr = head;
        while (curr != null) {
            Node22 next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    private static void printLinkedList(Node22 head) {
        Node22 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
