package sorting2;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[]arr={9, 8, 4, 2, 0, 1, 5};
        quickSort(arr,0,arr.length-1);
    }



    public  static void  quickSort(int[] arr ,int low,int high){
        if(low<high) {
            int p = partition(arr, high);
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }
    public static int partition(int[]arr,int pivot){
//        boolean operation_completed=false;
        int j=0;
        int i=j-1;
        for (int k=0;k<arr.length-1;k++){

            if(arr[j]<arr[pivot]){
                i++;
                System.out.printf("\n Since %d is smaller than  %d -we move i ahead and swap i= %d with j= %d \n",arr[j],arr[pivot],arr[i],arr[j]);
                System.out.println("<<<<<< New Array >>>>>>>> ");
                System.out.println(Arrays.toString(arr));
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
            else if(arr[j]>=arr[pivot]){
                System.out.printf("\n Since %d is greater or equal than  %d -we move j ahead to %d \n",arr[j],arr[pivot],arr[j+1]);
                j++;
            }
        }

            int temp=arr[i+1];
            arr[i+1]=arr[pivot];
            arr[pivot]=temp;


        System.out.println(Arrays.toString(arr));

        return i+1;

    }
}
