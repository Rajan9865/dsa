package linkedList;

import java.util.ArrayList;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 2/9/2026
 */
public class PairSumDLL {
    public static void main(String[] args) {
        NodeDouble a = new NodeDouble(1);
        NodeDouble b = new NodeDouble(2);
        NodeDouble c = new NodeDouble(3);
        NodeDouble d = new NodeDouble(4);
        a.next = b;
        b.next = c;
        c.next = d;

        b.prev = a;
        c.prev = b;
        d.prev = c;
        int target = 7;
        ArrayList<ArrayList<Integer>> result = findPairsWithGivenSum(a, target);
        System.out.println(result);

    }

    private static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(NodeDouble head, int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (head == null) {
            return result;
        }
        NodeDouble left = head;
        NodeDouble right = head;
        while (right.next != null) {
            right = right.next;
        }
        while (left != right && left.prev != right) {
            int sum = left.value + right.value;
            if (sum == target) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(left.value);
                pair.add(right.value);
                result.add(pair);
                left = left.next;
                right = right.prev;
            } else if (sum < target) {
                left = left.next;
            } else {
                right = right.prev;
            }
        }
        return result;
    }
}
