package Arrays.Easy;

import sorting2.QuickSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[]arr1={4,2,6,1};
        int[]arr2={7,8,4,9,10};
        union(arr1,arr2);

    }

    public static void quickSort(int[]arr,int low,int high){

        if(low<high){
            int p=partition(arr,low,high);
            quickSort(arr,low,p-1);
            quickSort(arr,p+1,high);
        }

    }
    public static int partition(int[]arr,int low,int pivot){
        int j=low;
        int i=j-1;
        while (j<=pivot){
            if(arr[j]<arr[pivot]){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            j++;
        }
        int temp=arr[i+1];
        arr[i+1]=arr[pivot];
        arr[pivot]=temp;

        System.out.println(Arrays.toString(arr));


return i+1;

    }

    public static void union(int[]arr1,int[]arr2){
        quickSort(arr1,0,arr1.length-1);
        quickSort(arr2,0,arr2.length-1);
        int l=0;
        int r=0;
        ArrayList<Integer> list=new  ArrayList<>();
        for(int i=0;i<arr1.length;i++){

        }

    }



}
