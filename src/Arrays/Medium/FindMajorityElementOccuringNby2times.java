package Arrays.Medium;

import java.util.Arrays;

public class FindMajorityElementOccuringNby2times {

    public static void main(String[] args) {
        int[]arr={1, 2, 2,1,5,1};
        int res=findMajorityElement(arr);
        System.out.println(res);
    }
    public static  int findMajorityElement(int[] nums) {

        int count=0;
        int element =0;
        for(int i=0;i<nums.length;i++){
           if(count==0){
               element=nums[i];
               count++;
           }
           else if(nums[i]==element){

               count++;
           }
           else{
               count--;
           }
        }


        int actualCount = 0;
        for (int num : nums) {
            if (num == element) {
                actualCount++;
            }
        }

        if (actualCount > nums.length / 2) {
            return element; // Valid majority element found
        }

        return -1;




    }
}
