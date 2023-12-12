/*JAVA program that accepts a string and calculate the number
of digits and letters. 
Sample Data : SRMIST JULY 2023
Expected Output :
Letters 10
Digits 4*/


import java.util.Scanner;
public class str{
 
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String word;    //counter variable
        System.out.println("Enter a string");
        word=s.nextLine();
        int letters=0;
        int digits=0;
        
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)>=48 && word.charAt(i)<=57)
                digits++;
            else if(word.charAt(i)>=65 && word.charAt(i)<=122){
                letters++;
            }
        }
        System.out.println("Letters = "+letters);
        System.out.println("Digits = "+digits);
    }
}
