package array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 2/9/2026
 */
public class RemoveDuplicatesArrayListUnsortedOrder {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 2, 1, 4, 2};
//        ArrayList<Integer> result = removeDuplicates(arr);
        ArrayList<Integer> result1 = removeRadioastronomicalWay(arr);
        System.out.println("Array after removing duplicates:");
//        System.out.println(result);
        System.out.println("Array after removing duplicates:" + result1);
    }

    private static ArrayList<Integer> removeRadioastronomicalWay(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        if (arr == null || arr.length == 0)
            return result;
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                result.add(arr[i]);
            }
        }
        return result;
    }

    private static ArrayList<Integer> removeDuplicates(int[] number) {
        ArrayList<Integer> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        if (number == null || number.length == 0)
            return result;
        for (int num : number) {
            if (set.add(num)) {
                result.add(num);
            }
        }
        return result;
    }
}
