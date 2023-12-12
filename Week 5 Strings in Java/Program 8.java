/*Java program using function to count the number of each character of a given text/string.*/


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharacter{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string:"); //string is inputed
        String input=sc.nextLine();
        
        Map<Character,Integer> characterCountMap=countCharacterOccurrences(input); 
        System.out.println("Character occurrences in the string:");
        for(Map.Entry<Character,Integer> entry:characterCountMap.entrySet()){
            System.out.println("'"+entry.getKey()+"': "+entry.getValue());
        } 
        sc.close();
    }
    
    //function to count the number of each character of a given text/string
    public static Map<Character,Integer> countCharacterOccurrences(String str){
        Map<Character, Integer> characterCountMap=new HashMap<>();
        
        for(char ch:str.toCharArray()){
            characterCountMap.put(ch,characterCountMap.getOrDefault(ch, 0) + 1);
        } 
        return characterCountMap;
    }
}
