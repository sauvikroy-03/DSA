package patterns;

public class Pattern12 {

    public static void main(String[] args) {
        for(int i=1;i<6;i++){
            for (int k=0;k<i;k++){
                char m=(char)('A'+k);
                System.out.print(m);
            }
            System.out.println(" ");
        }
    }
}
