package Arrays.Medium;

import java.util.Arrays;

public class SortArraysOf0s1s2s {
    public static void main(String[] args) {
int[]nums={2,0,0};
sort(nums);
    }
    public static void sort(int[]nums){

    int low=0;
    int mid=0;
    int high=nums.length-1;

    while (mid<=high){
        if(nums[mid]==0){
            int temp=nums[low];
            nums[low]=nums[mid];
            nums[mid]=temp;
            low++;
            mid++;
        }
        else if(nums[mid]==1){
            mid++;
        }
        else if(nums[mid]==2){
            int temp=nums[high];
            nums[high]=nums[mid];
            nums[mid]=temp;
            high--;

        }
    }


    }

}
