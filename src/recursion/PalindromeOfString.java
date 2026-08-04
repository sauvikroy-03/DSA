package recursion;

public class PalindromeOfString {

    public static void main(String[] args) {
        String str="Maak";
        int pointer=0;
        boolean result=checkPalindrome(str,pointer);
        System.out.println(result);

    }
    public static boolean checkPalindrome(String str,int pointer){

        if(str.toLowerCase().charAt(pointer)==str.toLowerCase().charAt(str.length()-1-pointer)){
            pointer++;

        }
        else if(str.toLowerCase().charAt(pointer)!=str.toLowerCase().charAt(str.length()-1-pointer)){
            return false;
        }
        if (pointer>=Math.floor(str.length()/2)){
            return true;
        }

        return checkPalindrome(str,pointer);

    }
}
