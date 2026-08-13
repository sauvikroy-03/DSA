package Arrays.Easy;

import java.util.HashMap;
import java.util.Map;

public class NumberThatAppearsOnce {

    public static void main(String[] args) {
        int []nums={2,1,2,1,4,4};
        findThatNumber(nums);
    }

    public static int findThatNumber(int[]nums){
        HashMap<Integer,Integer>map=new  HashMap<>();
        int res=-1;
        for (int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            Integer value=entry.getValue();
            Integer key=entry.getKey();
            if(value==1){
                res=key;
                return key;
            }
        }

        return res;

    }
}
