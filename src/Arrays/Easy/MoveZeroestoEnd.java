package Arrays.Easy;

import java.util.Arrays;

public class MoveZeroestoEnd {

    public static void main(String[] args) {
     int[]arr={1,0,4,0,1,9,0};
     moveZeroes(arr);
    }
    public static void moveZeroes(int[]arr){
        int low=0;
        int high=0;
    while(high<arr.length){
        if(arr[low]!=0){
            low++;
        }
        else if(arr[low]==0 && arr[high]!=0){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
        }
        high++;
        System.out.println(Arrays.toString(arr));
    }

    }
}
