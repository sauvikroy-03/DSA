package patterns;

public class Pattern10 {
    public static void main(String[] args) {
        int y=6;

            for (int i=1;i<5;i++){
                //left half
                for(int j=0;j<i;j++){
                    System.out.print(j+1);
                }
                for(int z=0;z<y;z++){
                    System.out.print(" ");
                }
                y-=2;
                //right half
                for(int j=i;j>=1;j--){
                    System.out.print(j);
                }
                System.out.println("");
            }




    }
}
