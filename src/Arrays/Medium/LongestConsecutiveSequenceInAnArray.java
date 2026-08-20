package Arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestConsecutiveSequenceInAnArray {

    public static void main(String[] args) {
    int[]nums={100, 4, 200, 1, 3, 2};
    mergeSort(nums,0,nums.length-1);
    find(nums);
    }
    public static void mergeSort(int[]nums,int low,int high){
        if(low>=high){
            return;
        }
        int mid=(low+high)/2;
        mergeSort(nums,low,mid);
        mergeSort(nums,mid+1,high);
        merge(nums,low,mid,high);
    }
    public static void merge(int[]nums,int low,int mid,int high){
        int left=low;
        int right= mid+1;
        ArrayList<Integer> list=new ArrayList<>();


        while (left<=mid&&right<=high){
            if(nums[left]<=nums[right]){
                list.add(nums[left]);
                left++;
            }
            else if (nums[right]<=nums[left]){
                list.add(nums[right]);
                right++;
            }
        }
        while (left<=mid){
            list.add(nums[left]);
            left++;
        }
        while (right<=high){
            list.add(nums[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            nums[i] = list.get(i - low);
        }
        System.out.println(Arrays.toString(nums));
    }

        public static int find(int[] nums) {
            if (nums.length == 0) {
                System.out.println(0);
                return 0;
            }

            int maxCount = 1;
            int count = 1;

            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] + 1 == nums[i + 1]) {
                    count++;
                } else if (nums[i] == nums[i + 1]) {
                    continue;
                } else {
                    count = 1;
                }

                if (count > maxCount) {
                    maxCount = count;
                }
            }

            return maxCount;
        }

}
