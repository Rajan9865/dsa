package top100dsa;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 9/8/2026
 */
public class PairDifferenceBruteForce {
    static void main() {
        int[] number = {1, 3, 5, 8, 10};
        int target = 2;
        boolean result = hasPairWithDifference(number, target);
        System.out.println("Target Difference: " + target
        );
        System.out.println("Pair Exists: " + result
        );
    }

    private static boolean hasPairWithDifference(int[] number, int target) {
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[j] - number[i] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
