package patterns;

public class Pattern17 {
    public static void main(String[] args) {
        int no_of_spaces=0;
        for(int i=5;i>0;i--){
            for(int j=i;j>0;j--){

                System.out.print("*");
            }
            for(int k=0;k<no_of_spaces*2;k++){
                System.out.print(" ");
            }
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println(" ");
            no_of_spaces+=1;
        }
        no_of_spaces=4;
        for(int i=1;i<6;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            for(int k=0;k<no_of_spaces*2;k++){
                System.out.print(" ");
            }
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println(" ");
            no_of_spaces-=1;
        }
    }
}
