package Arrays.Medium;

import java.util.ArrayList;

public class LongestConsecutiveSequenceInAnArray {

    public static void main(String[] args) {
    int[]arr={100, 4, 200, 1, 3, 2};
    mergeSort(arr,0,arr.length-1);
    find(arr);

    }
    public static void mergeSort(int[]arr,int low,int high){
        if(low>=high){
            return;
        }
        int mid=(low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
    }
    public static void find(int[]arr){
        ArrayList<Integer>list=new ArrayList<>();

    }
}
