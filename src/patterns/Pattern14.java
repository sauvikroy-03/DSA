package patterns;

public class Pattern14 {
    public static void main(String[] args) {
        int g=0;

        for (int i=1;i<6;i++){
            for (int k=0;k<i;k++){
                System.out.print((char) ('A'+g));
            }
            g++;
            System.out.println(" ");
        }
    }
}
