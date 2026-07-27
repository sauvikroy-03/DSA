package patterns;

public class Pattern13 {
    public static void main(String[] args) {
        for (int i=5;i>0;i--){
            for (int k=0;k<i;k++){
                System.out.print((char) ('A'+k));
            }
            System.out.println(" ");

        }
    }
}
