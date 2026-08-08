package sorting2;

import java.util.Arrays;

public class RecursiveBubbleSort {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        recursiveBubbleSort(arr, arr.length - 1);
    }
    public static void recursiveBubbleSort(int[] arr, int key) {
        // Base case
        if (key <= 0) {
            return;
        }
        int didSwap = 0;
        for (int i = 0; i < key; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                didSwap = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
        if (didSwap == 0) {
            return;
        }
        recursiveBubbleSort(arr, key - 1);
    }
}