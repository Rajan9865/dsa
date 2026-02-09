package array;

import java.util.ArrayList;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 2/7/2026
 */
public class RemoveDuplicatesArrayList {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4};
        ArrayList<Integer> result = removeDuplicates(arr);
        System.out.println("Array after removing duplicates:");
        System.out.println(result);
    }

    private static ArrayList<Integer> removeDuplicates(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        if (arr.length == 0 || arr == null)
            return result;
        result.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                result.add(arr[i]);
            }
        }
        return result;
    }
}
