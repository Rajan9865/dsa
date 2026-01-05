package linkedList;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 1/5/2026
 */
public class RemoveLoopByMethods {
    public static void main(String[] args) {
        Node22 a = new Node22(1);
        Node22 b = new Node22(2);
        Node22 c = new Node22(3);
        Node22 d = new Node22(4);
        Node22 e = new Node22(5);
        Node22 f = new Node22(6);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = a;
        removeloop(a);
        printLinkedlist(a);
    }

    private static void removeloop(Node22 head) {
        Node22 GoToMeeting = detector(head);
        if (GoToMeeting == null) {
            return;
        }
        Node22 loopstart = findLoopStart(head, GoToMeeting);
        Node22 temp = loopstart;
        while (temp.next != loopstart) {
            temp = temp.next;
        }
        temp.next = null;
    }

    private static Node22 findLoopStart(Node22 head, Node22 GoToMeeting) {
        Node22 ptr1 = head;
        Node22 ptr2 = GoToMeeting;
        while (ptr1 != ptr2) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return ptr1;
    }

    private static void printLinkedlist(Node22 head) {
        Node22 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    private static Node22 detector(Node22 head) {
        Node22 slow = head;
        Node22 fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return slow;
            }
        }
        return null;
    }

}
