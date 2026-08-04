package recursion;

public class PrintNto1 {

    public  static void print(int count){
        if(count==0){
            return;
        }
        System.out.println(count+" ");
        print(count-1);
    }
    public static void main(String[] args) {
        print(10);
    }
}
