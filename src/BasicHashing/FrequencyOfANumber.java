package BasicHashing;

import java.util.Arrays;
import java.util.Scanner;

public class FrequencyOfANumber {

    public static void main(String[] args) {
        int[] arr={2,1,3,9,1,3,0,1,10,10};

        int[]hash=new int[12]; //all the elements are initialoised to zero

        for(int i=0;i<arr.length;i++){
            hash[arr[i]]++; // updates the index of hash[] by +1 of the corresponding element in arr... for example. if the element in arr is 2 ,then the 2 index of hash will be incremented
        }
        getFrequency(hash);

    };

    public static void getFrequency(int[]hash){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int a=sc.nextInt();
        System.out.printf("%d is present %d times ",a,hash[a]);


    }


}
