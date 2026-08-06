package sorting1;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[]arr={23,5,56,89,5,66,4,110};
        selectionSort(arr);
    }
    public  static void selectionSort(int[] arr){

        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
