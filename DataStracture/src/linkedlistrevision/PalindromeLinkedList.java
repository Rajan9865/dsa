package linkedlistrevision;

import linkedList.Node22;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 2/4/2026
 */
public class PalindromeLinkedList {
    public static void main(String[] args) {
        Node22 a = new Node22(1);
        Node22 b = new Node22(2);
        Node22 c = new Node22(3);
        Node22 d = new Node22(2);
        Node22 e = new Node22(1);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println(isPalindrome(a) ? "isPalindrome" : "isNotPalindrome");
    }

    private static boolean isPalindrome(Node22 head) {
        if (head == null || head.next == null) {
            return true;
        }
        Node22 slow = head;
        Node22 fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node22 secondPart = reverse(slow);
        Node22 firstPart = head;
        Node22 tempSecondPart = secondPart;
        while (tempSecondPart != null) {
            if (tempSecondPart.data != firstPart.data) {
                return false;
            }
            firstPart = firstPart.next;
            tempSecondPart = tempSecondPart.next;
        }
        return true;
    }

    private static Node22 reverse(Node22 head) {
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
}
