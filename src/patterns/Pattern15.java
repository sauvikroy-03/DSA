package patterns;

public class Pattern15 {
    public static void main(String[] args) {

        int z=0;

        for(int j=1;j<5;j++){
            for(int k=3-(j-1);k>0;k--){
                System.out.print(" ");
            }
            for (int l=0;l<j;l++){
                System.out.print((char)('A'+l));
            }
            for (int l=j-1;l>0;l--){
                System.out.print((char)('A'+l-1));
            }
            System.out.println(" ");
        }
    }
}
