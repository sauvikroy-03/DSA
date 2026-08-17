package Arrays.Medium;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[]ar={3,2,1};
        find(ar);
        //exp=2,1,3
    }
    public static void find(int[]nums){
        int index=-1;
        //find the breakpoint
        for(int j=nums.length-1;j>0;j--){
            if(nums[j]>nums[j-1]){
                index=j-1;
                break;
            }
        }
        //if a breakpoint exist find the next biggest element after number at index
        if(index!=-1) {
            for (int j = nums.length - 1; j >= 0; j--) {
                System.out.println("j");
                if (nums[j] > nums[index]) {
                    int temp = nums[index];
                    nums[index] = nums[j];
                    nums[j] = temp;
                    break;
                }
            }
        }
        //then reverse the remaining element
        reverse(nums,index+1);
        //Now reverse the numsay from index to n-1  from right;

        System.out.println(Arrays.toString(nums));
    }

    public static void reverse(int[]nums,int index){
        int k=((nums.length-1)-index)-1%nums.length;
        int low=index;
        int high=nums.length-1;

        while(low<high){
            int temp=nums[low];
            nums[low]=nums[high];
            nums[high]=temp;
            low++;
            high--;

        }



    }
}
