package Arrays.Medium;

import java.util.Arrays;

public class SetMatrixtoZero {

    public static void main(String[] args) {
        int[][]arr={{1,4,8},{0,3,0}};
        set(arr);
    }
    public static void set(int[][]arr){
        int row=arr.length;
        int col=arr[0].length;
        boolean[] selectedrow=new boolean[arr.length];
        boolean[] selectedcol=new boolean[arr[0].length];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if (arr[i][j]==0){
                   selectedrow[i]=true;
                   selectedcol[j]=true;

                }
            }
        }
        //set cols to 0
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(selectedrow[i]||selectedcol[j]){
                    arr[i][j]=0;
                }
            }
        }


        System.out.println(Arrays.deepToString(arr));


    }
}
