package BasicHashing;

import java.util.HashMap;
import java.util.Scanner;

public class CharacterHashing {

    public static void main(String[] args) {
        //we will be using a hashmap

        char[] arr={'a','b','a','z','k','b','g','i'};
        HashMap<Character,Integer> character_frequency=new  HashMap<>();
        for (char c:arr){
            character_frequency.put(c,character_frequency.getOrDefault(c,0)+1);
        }
        getChFrequency(character_frequency);

    }

    public static void getChFrequency(HashMap<Character,Integer>characters){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter character ");
        char character=sc.nextLine().charAt(0);
        if(characters.containsKey(character)){
            System.out.printf("%s appears %d times in the array ",character,characters.get(character));
        }
        else {
            System.out.printf("%s does not appear in the array ",character);
        }
    }


}
