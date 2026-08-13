package Arrays.Easy;

public class MaximumConsecutive1s {
    public static void main(String[] args) {
        int[]a={};
        int res=getRes(a);
        System.out.println(res);
    }
    public static  int getRes(int[]arr){
        int count=0;
        int temp=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                temp++;
            }
            else if(arr[i]==0){
                temp=0;
            }
            if(temp>count){
                count=temp;
            }
        }
        return count;

    }
}
