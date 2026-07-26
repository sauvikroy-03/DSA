package patterns;

public class Pattern2 {

    public static void main(String[] args) {
        System.out.println("Pattern 5");
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i <= j; i++) {
                System.out.print(i);
            }
            System.out.println("");
        }
    }
}
