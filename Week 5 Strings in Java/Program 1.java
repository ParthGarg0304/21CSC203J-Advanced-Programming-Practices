/*a Java program (using function) to print the mirror image of the given string.*/

  
import java.util.Scanner;

public class mirrorImage{
    //Function to generate the mirror image of a string
    static String generateMirrorImage(String str){
      int length=str.length(); //find length of string
      StringBuilder mirrorImage=new StringBuilder();
     
      for(int i=length-1;i>=0;i--){
        mirrorImage.append(str.charAt(i));
      }
      return mirrorImage.toString();
    }
    public static void main(String[] args){
      System.out.println("Parth Garg \nRA2211003011322");
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter a string:"); //input string
      String input=sc.nextLine();
      String mirrorImage=generateMirrorImage(input);        
      System.out.println("Mirror Image:"+mirrorImage); //display mirror image of string
      sc.close();
    }
}
