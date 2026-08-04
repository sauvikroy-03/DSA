package patterns;

import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int no_of_rows= sc.nextInt();
        System.out.println("Enter the number of columns ");
        int no_of_columns=sc.nextInt();

        for(int i=0;i<no_of_rows;i++){
            if(i>=1 && i!=no_of_rows-1){
                for(int k=1;k>0;k--){
                    System.out.print("*");
                }
                for(int k=0;k<=(no_of_columns-2)*2;k++){
                    System.out.print(" ");
                }
                for(int k=1;k>0;k--){
                    System.out.print("*");
                }
            }
            else{
                for(int k=no_of_columns;k>0;k--){
                    System.out.print("*");
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }

}
