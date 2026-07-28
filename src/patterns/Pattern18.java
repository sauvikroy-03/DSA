package patterns;

public class Pattern18 {
    public static void main(String[] args) {
        int no_of_spaces1=4;
        int no_of_spaces2=1;


        for(int i=1;i<6;i++){
            for(int k=0;k<i;k++){
                System.out.print("*");
            }

            for(int sp1=no_of_spaces1*2;sp1>0;sp1--){
                System.out.print(" ");
            }
            no_of_spaces1-=1;
            for (int k=0;k<i;k++){
                System.out.print("*");
            }

            System.out.println(" ");
        }


        //2nd column

        for(int i=4;i>0;i--){
            for(int k=0;k<i;k++){
                System.out.print("*");
            }
            for(int sp1=0;sp1<no_of_spaces2*2;sp1++){
                System.out.print(" ");
            }

            for(int k=0;k<i;k++){
                System.out.print("*");
            }
            no_of_spaces2+=1;
            System.out.println(" ");
        }

    }
}
