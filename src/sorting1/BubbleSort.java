package sorting1;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={48,52,6,26,1};
        bubblesort(arr);
    }
    public static void bubblesort(int[]arr){
        int key=arr.length;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<key-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                System.out.println(Arrays.toString(arr));
            }
            key--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
