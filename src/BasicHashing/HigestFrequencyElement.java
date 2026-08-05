package BasicHashing;

import java.util.HashMap;
import java.util.Scanner;

public class HigestFrequencyElement {

    public static void main(String[] args) {
        int[] arr={2,2,2,2,2,1,1,1,5,5};
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int a:arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        getHighestAndLowestFrequency(map);
    }

    public static void getHighestAndLowestFrequency(HashMap<Integer,Integer> map){
        int maxFreq=0;
        int maxFreqElement=0;
        int minFreq=Integer.MAX_VALUE;
        int minFreqElement=0;
        for(HashMap.Entry<Integer,Integer> entry:map.entrySet()){

            if(entry.getValue()>maxFreq){
                maxFreq=entry.getValue();
                maxFreqElement=entry.getKey();
            }
            if(entry.getValue()<minFreq){
                minFreq=entry.getValue();
                minFreqElement=entry.getKey();
            }
        }

        System.out.printf("Highest Frequency Element is %d and lowest frequency element is %d ",maxFreqElement,minFreqElement);

    }
}
