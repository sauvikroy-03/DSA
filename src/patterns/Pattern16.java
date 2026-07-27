package patterns;

public class Pattern16 {
    public static void main(String[] args) {

        for (int k=0;k<5;k++){

            for (int j=k;j>=0;j--){
                System.out.print((char)('E'-j));
                System.out.print(" ");
            }

            System.out.println(" ");
        }
    }
}
