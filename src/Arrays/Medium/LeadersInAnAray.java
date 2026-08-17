package Arrays.Medium;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class LeadersInAnAray {
    public static void main(String[] args) {
        int[]arr={16,10,5,0,0,9};

        ArrayList<Integer>res=leaders(arr);
        System.out.println(res);
    }
    public static ArrayList<Integer> leaders(int[]arr){
        ArrayList<Integer> list=new ArrayList<>();

        int pointer=arr.length-1;
        if(arr.length>0) {
            list.add(arr[pointer]);
            for (int i =arr.length - 1 ; i >=0; i--) {
                if (arr[i] >=  arr[pointer] && i!=pointer ) {
                    list.add(arr[i]);
                    pointer=i;
                }
            }


            Collections.reverse(list);
        }


        return  list;
    }
}
