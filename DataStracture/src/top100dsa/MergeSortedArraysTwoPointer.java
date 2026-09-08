package top100dsa;

import java.util.Arrays;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 9/8/2026
 */
public class MergeSortedArraysTwoPointer {
    static void main() {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        int[] result = merge(arr1, arr2);
        System.out.println("array 1" + Arrays.toString(arr1));
        System.out.println("array 2" + Arrays.toString(arr2));
        System.out.println("result" + Arrays.toString(result));
    }

    private static int[] merge(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] result = new int[n1 + n2];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                result[k] = arr1[i];
                i++;
            } else if (arr1[i] > arr2[j]) {
                result[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            result[k] = arr1[i];
            i++;
            k++;
        }
        while (j < n2) {
            result[k] = arr2[j];
            j++;
            k++;
        }
        return result;
    }
}
