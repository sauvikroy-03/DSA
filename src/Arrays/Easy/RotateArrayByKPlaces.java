package Arrays.Easy;

import java.util.Arrays;

public class RotateArrayByKPlaces {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int k=3;
        int[] res=getResultantArray(arr,k);
        System.out.println(Arrays.toString(res));

    }

    public static  int[] getResultantArray(int[]arr,int k){
        k=k%arr.length;
    reverse(arr,0,k);
reverse(arr,k+1,arr.length-1);
 return reverse(arr,0,arr.length-1);

    }

    public static int[] reverse(int[]arr,int low,int high){

        while (low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;

        }
        return arr;
    }



}
