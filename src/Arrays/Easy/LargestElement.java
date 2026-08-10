package Arrays.Easy;

public class LargestElement {

    public static void main(String[] args) {
        int[] arr={1,4,2,5,0};
       largestNumber(arr);
    }
    public static void largestNumber(int[]arr){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if (arr[i]>largest){
                largest=arr[i];
            }

        }
        System.out.println("Largest number is "+largest);
    }


}
