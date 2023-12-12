/*JAVA program that accepts a word from the user and reverse it. */
  
import java.util.Scanner;

public class Main{

    public static String reverse(String input) {

        if (input == null){
            return null;
        }
        
        StringBuilder output = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            output.append(input.charAt(i));
        }

        return output.toString();
    }

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String text;    //counter variable
        System.out.println("Enter a string");
        text=s.nextLine();
        System.out.println("Original string - " + text);
        System.out.println("Reversed string - " + reverse(text));
    }
}
