/*Java program (using function) to check if two strings are rotationally equivalent.
Sample Output
string 1 is : srmist
string 2 is : tsrmis
  */

import java.util.Scanner;

public class RotationalEquivalence{
    // Function to check if two strings are rotationally equivalent
    static boolean areRotationallyEquivalent(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        String concatenated=str1+str1;
        //to find if string 2 is part of concatenated string
        return concatenated.contains(str2); 
    }

    public static void main(String[] args){
        System.out.println("Parth Garg \nRA2211003011322");
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter string 1:"); //input string 1
        String string1=sc.nextLine();
        
        System.out.print("Enter string 2:"); //input string 2
        String string2=sc.nextLine();
        
        boolean rotationalEquivalent=areRotationallyEquivalent(string1,string2);
        if(rotationalEquivalent) //if rotationally equivalent
        {
            System.out.println("The two strings are rotationally equivalent.");
        } 
        else //if not rotationally equivalent
        {
            System.out.println("The two strings are not rotationally equivalent.");
        }
        sc.close();
    }
}
