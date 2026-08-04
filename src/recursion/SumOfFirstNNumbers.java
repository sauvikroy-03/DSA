package recursion;

public class SumOfFirstNNumbers {

    static int sum=0;
public static void sum(int count){
    if (count==11){
        return;
    }
    sum+=count;
    System.out.println("Sum is "+sum);
    System.out.println(" ");
    sum(count+1);
}
    public static void main(String[] args) {
        sum(1);
    }
}
