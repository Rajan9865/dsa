package top100dsa;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 9/8/2026
 */
public class PairDifferenceTwoPointer {
    static void main() {
        int[] number = {1, 2, 3, 4, 5};
        int target = 2;
        boolean result = hasPairWithDifference(number, target);
        System.out.println("Target Difference: " + target);
        System.out.println("Result: " + result);
    }

    private static boolean hasPairWithDifference(int[] number, int target) {
        int i = 0;
        int j = 1;
        while (i < number.length && j < number.length) {
            if (i == j) {
                j++;
                continue;
            }
            int difference = number[j] - number[i];
            if (difference == target) {
                return true;
            } else if (difference < target) {
                j++;
            } else {
                i++;
            }
        }
        return false;
    }
}
