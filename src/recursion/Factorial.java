package recursion;

public class Factorial {
    public static void main(String[] args) {
       long res= factorial(10);
       System.out.println("Factorial is "+res);

    }
    public static long factorial(int num){
        if(num<=1) {
            return (1);
        }
        return num*factorial(num-1);
    }
}
