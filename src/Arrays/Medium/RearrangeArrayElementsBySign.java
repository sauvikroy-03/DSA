package Arrays.Medium;

import java.util.Arrays;

public class RearrangeArrayElementsBySign {
    public static void main(String[] args) {
        int[] nums = {1,2,-4,-5,6,3};
        int[] res = rearrange(nums);
        System.out.println(Arrays.toString(nums));
        //1,-4,2,-5
    }
    public static int[] rearrange(int[] nums) {
        int i = 0;
        for (int j = 0; j <nums.length ;j++) {
            if(nums[i]<0&&nums[j]>0){
                int temp=nums[i];
                nums[i]=nums[j];
                i++;
                nums[j]=nums[i];
                nums[i]=temp;
                i++;
                System.out.println(Arrays.toString(nums));
            }
        }













//        for (int i = 1; i < nums.length ; i++) {
//            if (nums[pointer] > 0 && nums[i] < 0 ) {
//                int temp = nums[pointer + 1];
//                nums[pointer + 1] = nums[i];
//                System.out.println(i);
//                nums[i] = temp;
//                pointer=i+1;
//            }
//            if(nums[pointer]<0 && nums[i]>0 ){
//                int temp=nums[pointer];
//                nums[pointer]=nums[i];
//                nums[i]=temp;
//                pointer=i+1;
//            }
//        }
        return nums;
    }}

