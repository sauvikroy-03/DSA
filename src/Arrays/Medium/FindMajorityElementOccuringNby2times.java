package Arrays.Medium;

import java.util.Arrays;

public class FindMajorityElementOccuringNby2times {

    public static void main(String[] args) {
        int[]arr={1, 2, 2};
        findMajorityElement(arr);
    }
    public static  void findMajorityElement(int[] nums) {

        int threshhold=nums.length/2;
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

        System.out.println(element);



    }
}
