package recursion;

import java.util.Arrays;

public class ReverseAnArray {

    public static void main(String[] args) {
        int[] arr={1,5,2,4,3};
        int pointer=0;
        int[]res=reverse(arr,pointer);
        System.out.println(Arrays.toString(res));

    }
    public static int[] reverse(int[]arr,int pointer){

        if(pointer>=Math.floor(arr.length/2)){
            return arr;
        }
        int temp=arr[pointer];
        arr[pointer]=arr[arr.length-1-pointer];
        arr[arr.length-1-pointer]=temp;

        return reverse(arr,pointer+1);

    }
}
