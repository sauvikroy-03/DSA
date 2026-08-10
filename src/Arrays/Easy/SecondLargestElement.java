package Arrays.Easy;

public class SecondLargestElement {

    public static void main(String[] args) {

        int[] arr={8,1,9,0,2,0,10};
        secondLargestNumber(arr);
    }
    public static void secondLargestNumber(int[]arr){
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if (arr[i]>largest){
                //this way second largest will hold previous value of largest
                secondLargest=largest;
                largest=arr[i];
            }
            else if (arr[i]<largest && arr[i]>secondLargest){
                //checks in the whole array that if a number lesser than largest and greater than previous value of largest exists...
                secondLargest=arr[i];
            }
        }

        System.out.println("Second Largest number is "+secondLargest);
    }
}
