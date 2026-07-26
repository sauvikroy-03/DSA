package patterns;

public class Pattern7 {

    public static void main(String[] args) {
        int f=0;
        int l=0;
        for(int i=1;i<10;i=i+2){
            for(int k=l;k<4;k++ ){
                System.out.print(" ");
            }
            l++;
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=9;i>0;i=i-2){
            for (int j=0;j<f;j++){
                System.out.print(" ");
            }
            f++;
            for (int j=0;j<i;j++){
              System.out.print("*");
            }
            System.out.println("");

        }
    }
}
