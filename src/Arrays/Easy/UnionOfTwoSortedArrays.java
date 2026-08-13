package Arrays.Easy;

import java.util.Arrays;


public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[]arr1={1,2,3,4};
        int[]arr2={4,7,8,9,10};
        union(arr1,arr2);

    }



    public static void union(int[]arr1,int[]arr2){
        int l=0;
        int r=0;
        int k = 0; // Write pointer for arrX
        int[]arrX=new int[arr1.length+arr2.length];
        while (l < arr1.length && r < arr2.length) {
            if (arr1[l] < arr2[r]) {
                arrX[k++] = arr1[l++];
            } else if (arr2[r] < arr1[l]) {
                arrX[k++] = arr2[r++];
            } else { // arr1[l] == arr2[r] (Duplicate)
                arrX[k++] = arr1[l++];
                r++; // Skip duplicate in arr2
            }
        }

        // 2. Copy remaining elements from arr1 (if any)
        while (l < arr1.length) {
            arrX[k++] = arr1[l++];
        }

        // 3. Copy remaining elements from arr2 (if any)
        while (r < arr2.length) {
            arrX[k++] = arr2[r++];
        }

        int[]res=Arrays.copyOf(arrX,k);
System.out.println(Arrays.toString(res));
    }



}
