package Arrays.Easy;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[]arr={1,1,1,2,2,3,3,3,3,3,3,4};
        int res=removeDups(arr);
        System.out.println(res);
    }
    public static  int removeDups(int[]arr){
        int slow=0;
        if(arr.length>0) {
                for (int fast =1; fast < arr.length ; fast++) {
                   if(arr[fast]!=arr[slow]) {
                       slow++;
                       arr[slow]=arr[fast];

                    }
                }

        }
        else{
            return 0;
        }

return slow;
        }






    }

