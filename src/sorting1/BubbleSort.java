package sorting1;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={1, 6, 26, 48, 52};
        bubblesort(arr);
    }
    public static void bubblesort(int[]arr){
        int key=arr.length;

        for(int i=0;i<arr.length;i++){
            int didSwap=0;
            for(int j=0;j<key-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    didSwap=1;
                }
            }
            key--;
            if(didSwap==0){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
