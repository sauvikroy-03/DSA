package patterns;

public class Pattern9 {

    public static void main(String[] args) {
        boolean val = true;

        for (int j = 1; j < 6; j++) {
            for (int k = 0; k < j; k++) {
                if (val) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
                val = !val;
            }
            System.out.println(" ");


        }
    }
}

