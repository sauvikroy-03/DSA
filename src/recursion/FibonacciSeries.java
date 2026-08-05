package recursion;

public class FibonacciSeries {

    public static void main(String[] args) {

        int pointer=0;
        int first_no=0;
        int sec_no=1;
        fibonacci(first_no,sec_no,pointer);
    }
    public static void fibonacci(int first,int second,int pointer){
        if(pointer>15){
            return;
        }
        System.out.print(first+" ");
        
        fibonacci(second,first+second,pointer+1);

    }
}
