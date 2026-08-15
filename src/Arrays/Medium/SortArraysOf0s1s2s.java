package Arrays.Medium;

import java.util.Arrays;

public class SortArraysOf0s1s2s {


    public static void main(String[] args) {
int[]arr={2,0,0};
sort(arr);
    }
    public static void sort(int[]arr){

    int low=0;
    int mid=0;
    int high=arr.length-1;

    while (mid<=high){
        if(arr[mid]==0){
            int temp=arr[low];
            arr[low]=arr[mid];
            arr[mid]=temp;
            low++;
            mid++;
        }
        else if(arr[mid]==1){
            mid++;
        }
        else if(arr[mid]==2){
            int temp=arr[high];
            arr[high]=arr[mid];
            arr[mid]=temp;
            high--;

        }
    }

System.out.println(Arrays.toString(arr));

    }

}
