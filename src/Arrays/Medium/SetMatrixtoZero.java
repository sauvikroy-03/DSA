package Arrays.Medium;

import java.util.Arrays;

public class SetMatrixtoZero {

    public static void main(String[] args) {
        int[][]arr={{1,4,8},{2,3,0}};
        set(arr);
    }
    public static void set(int[][]arr){
        int row=arr.length;
        int col=arr[0].length;
        int selectedrow=-1;
        int selectedcol=-1;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if (arr[i][j]==0){
                   selectedrow=i;
                   selectedcol=j;
                   break;
                }
            }
            if(selectedrow!=-1){
                for(int k=0;k<arr[selectedrow].length;k++){
                    arr[selectedrow][k]=0;
                }
                selectedrow=-1;
            }

        }

        //set cols to 0
        for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){
                if(j==selectedcol){
                    arr[i][selectedcol]=0;
                }
            }
        }


        System.out.println(Arrays.deepToString(arr));


    }
}
