package Arrays.Medium;

import java.util.Arrays;

public class Rotateby90degree {
    public static void main(String[] args) {
        int[][]arr={{1,2,3},{4,5,6},{7,8,9}};
        rotate(arr);
    }
    public  static void rotate(int[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        int[][]newarr=new int[cols][rows];
        for(int i=0;i<cols;i++){
            for(int j=0;j<rows;j++){
                newarr[i][rows - 1 - j]=matrix[j][i];
            }
        }
        System.out.println(Arrays.deepToString(newarr));
    }
}
