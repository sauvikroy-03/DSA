package Arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;

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
        merge(arr,low,mid,high);
    }
    public static void merge(int[]arr,int low,int mid,int high){
        int left=low;
        int right= mid+1;
        ArrayList<Integer> list=new ArrayList<>();


        while (left<=mid&&right<=high){
            if(arr[left]<=arr[right]){
                list.add(arr[left]);
                left++;
            }
            else if (arr[right]<=arr[left]){
                list.add(arr[right]);
                right++;
            }
        }
        while (left<=mid){
            list.add(arr[left]);
            left++;
        }
        while (right<=high){
            list.add(arr[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = list.get(i - low);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void find(int[]arr){
        int count=1;

        for (int i=0;i<arr.length-1;i++){
            if(arr[i]+1==arr[i+1]){
                count++;

            }
        }
        System.out.println(count);

    }
}
