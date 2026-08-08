package sorting2;

import java.util.Arrays;

public class RecursiveInsertionSort {
    public static void main(String[] args) {
        int[]arr={3,1,5,2};
        int key=1;

        recursiveInsertionSort(arr,key);
    }
    public static void recursiveInsertionSort(int[] arr,int key){
        if(key>=arr.length){
            return;
        }
        int temp=arr[key];
        int j=key-1;
        while(j>=0&& arr[j]>temp){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=temp;


        System.out.println(Arrays.toString(arr));
        recursiveInsertionSort(arr,key+1);
    }
}
