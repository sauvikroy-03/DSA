package Arrays.Easy;

public class CheckForSortedArray {
    public static void main(String[] args) {
        int[]arr={1,1,1,1,1};
        check(arr);
    }
    public static void check(int[]arr){
        boolean flag=true;

        for(int i=0;i<arr.length-1;i++){
            if (arr[i+1]>=arr[i]){
                continue;
            }
            else{
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Not Sorted");
        }
    }

}
