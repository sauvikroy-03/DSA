package Arrays.Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class FindMissingNumbers {
    public static void main(String[] args) {
        int[]arr={2,3,4,5};
        int res=findMissing(arr);

        System.out.println("Missing no is "+res);
    }


    public static void mergeSort(int[]arr,int low,int high){
        if(low>=high){
            return;
        }
        int mid=(high+low)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public static void merge(int[]arr,int low,int mid,int high){
        ArrayList<Integer>list=new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high){

            if(arr[left]<=arr[right]){
                list.add(arr[left]);
                left++;
            }
            else{
                list.add(arr[right]);
                right++;
            }

        }

        while (left<=mid){
            list.add(arr[left]);
            left++;
        }
        while (right<=high){
            list.add(arr[right]);
            right++;
        }

        for(int i=0;i<list.size();i++){
            arr[low+i]=list.get(i);
        }


    }
    public  static int findMissing(int[]arr){

        mergeSort(arr,0,arr.length-1);
        if (arr == null || arr.length == 0) return -1;

        if(arr[0]!=1) return 1;

for(int i=1;i<arr.length;i++){
    if(arr[i-1]!=arr[i]-1){
       return arr[i]-1;
    }
}
return  arr[arr.length-1]+1;
    }
}
