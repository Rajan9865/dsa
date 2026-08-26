package top100dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 8/24/2026
 */
public class RemoveDuplicatesBruteForce {
    static void main() {
        int[] nums = {1, 1, 2, 2, 3, 3, 4};
        System.out.println("Original Array: " + Arrays.toString(nums));
        int k = removeDuplicates(nums);
        System.out.println("Unique Count: " + k);
        System.out.println("Modified Array: " + Arrays.toString(nums));
    }

    private static int removeDuplicates(int[] nums) {
        List<Integer> uniquesNumbers = new ArrayList<>();
        for (int num : nums) {
            if (!uniquesNumbers.contains(num)) {
                uniquesNumbers.add(num);
            }
            for (int i = 0; i < uniquesNumbers.size(); i++) {
                nums[i] = uniquesNumbers.get(i);
            }
        }
        return uniquesNumbers.size();
    }
}
