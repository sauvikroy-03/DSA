package Arrays.Medium;

public class MaximumSubArraySumInAnArray {

    public static void main(String[] args) {
//        int[]arr={-2,-3,4,-1,-2,1,5,-3};
        int []arr={-2,-3};
        find(arr);
    }
    public static void find(int[] arr){
        int i=0;
        int sum=arr[0];
        int temp=0;
        int low=0;
        int high=0;
        while(i<arr.length){
            System.out.printf("\ntemp is %d + %d = ",temp,arr[i]);
            temp+=arr[i];
            System.out.printf("%d",temp);

            if (temp>sum){
                sum=temp;
                high=i;
            }

            if(temp<0){
                temp=0;
                low=i;
            }
            i++;
        }



        for (int j=low;j<=high;j++){
            System.out.println(arr[j]);
        }
        System.out.println("\nRes "+sum);


    }
}
