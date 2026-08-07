package sorting2;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[]arr={4,2,9,1,12};
        mergeSort(arr,0,arr.length-1);

    }
    public static void mergeSort(int[]arr,int low,int high){
        if(low>=high){
            return;
        }
        int mid=(low+high)/2;
        System.out.println(" low="+arr[low]+" high="+arr[mid]);
        mergeSort(arr,low,mid);
        System.out.println("............................");
        System.out.println( "low="+arr[mid+1]+" high="+arr[high]);
        mergeSort(arr,mid+1,high);
        System.out.println("Merging");
        merge(arr,low,mid,high);
    }

    public static void merge(int[] arr,int low,int mid,int high){
        ArrayList<Integer>temp=new  ArrayList<>();
        int left=low;
        int right=mid+1;

        while(left<=mid&&right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }

        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }

        while (right<=high){
            temp.add(arr[right]);
            right++;
        }

        for (int i = 0; i < temp.size(); i++) {
            arr[low + i] = temp.get(i);
        }
        System.out.println("Merged "+ Arrays.toString(arr));
    }
}
