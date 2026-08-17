package Arrays.Medium;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[]ar={3,2,1};
        find(ar);
        //exp=2,1,3
    }
    public static void find(int[]arr){
        int index=-1;
        //find the breakpoint
        for(int j=arr.length-1;j>0;j--){
            if(arr[j]>arr[j-1]){
                index=j-1;
                break;
            }
        }
        //if a breakpoint exist find the next biggest element after number at index
        if(index!=-1) {
            for (int j = arr.length - 1; j >= 0; j--) {
                System.out.println("j");
                if (arr[j] > arr[index]) {
                    int temp = arr[index];
                    arr[index] = arr[j];
                    arr[j] = temp;
                    break;
                }
            }
        }
        //then reverse the remaining element
        reverse(arr,index+1);
        //Now reverse the array from index to n-1  from right;

        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[]arr,int index){
        int k=((arr.length-1)-index)-1%arr.length;
        int low=index;
        int high=arr.length-1;

        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;

        }



    }
}
