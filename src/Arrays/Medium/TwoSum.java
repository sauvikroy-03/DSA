package Arrays.Medium;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int a[]={1,2};
        int k=3;
        TwoSum(a,k);
    }
    public static void TwoSum(int[]arr,int k){
        HashMap<Integer,Integer> map=new HashMap<>();

        for (int i=0;i<arr.length;i++){
            map.put(arr[i],i);
            if(map.containsKey(k-arr[i])){
                System.out.println("Yes");
                break;
            }
            else{
                System.out.println("No");
            }
        }
    }
}
