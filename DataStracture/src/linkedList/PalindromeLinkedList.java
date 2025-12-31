package linkedList;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 12/30/2025
 */
public class PalindromeLinkedList {
    public static void main(String[] args) {
        Node21 a = new Node21(1);
        Node21 b = new Node21(2);
//        Node21 c = new Node21(3);
        Node21 d = new Node21(2);
        Node21 e = new Node21(1);
        a.next = b;
        b.next = d;
//        c.next = d;
        d.next = e;
        printLinkedList(a);
        boolean result = isPalindrome(a);
        System.out.println();
        if (result) {
            System.out.println(" linked list is palindrome");
        } else {
            System.out.println(" linked list is not palindrome");
        }
    }

    private static void printLinkedList(Node21 head) {
        Node21 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    //
    private static boolean isPalindrome(Node21 head) {
        if (head == null || head.next == null) {
            return true;
        }
        Node21 slow = head;
        Node21 fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node21 secondHald = reverseSecondHalf(slow);
        Node21 firstHalf = head;
        Node21 tempSecondHalf = secondHald;
        while (tempSecondHalf != null) {
            if (firstHalf.data != tempSecondHalf.data) {
                return false;
            } else {
                firstHalf = firstHalf.next;
                tempSecondHalf = tempSecondHalf.next;
            }
        }
        return true;
    }

    private static Node21 reverseSecondHalf(Node21 head) {
        Node21 prev = null;
        Node21 curr = head;
        while (curr != null) {
            Node21 next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}

class Node21 {
    int data;
    Node21 next;

    public Node21(int data) {
        this.data = data;
    }

}
