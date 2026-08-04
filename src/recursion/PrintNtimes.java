package recursion;

public class PrintNtimes {
    public static void main(String[] args) {
    print(1);


    }

    public static  void print(int count){
        if (count>10){
            return;
        }
        System.out.println(count);
        print(count+1);
    }
}
