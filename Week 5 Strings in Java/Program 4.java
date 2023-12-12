/*Java function (using function) that checks whether a passed string is palindrome or not. (Note : function type - No arguments with return values)*/


import java.util.Scanner;

public class CheckPalindrome{
    public static void main(String[] args){
        System.out.println("Parth Garg \nRA2211003011322");
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a string:"); //String is inputed from user
        String input=scanner.nextLine();
        //boolean function to check if string is palindrome or not
        boolean isPalindrome=checkPalindrome(input); 
        if(isPalindrome==true) //if string is palindrome
        {
            System.out.println("String is Palindrome");
        }
        else //if string is not palindrome
        {
            System.out.println("String is not Palindrome");
        }
        scanner.close();
    }   
    //function to check if given string is palindrome or not
    public static boolean checkPalindrome(String str) 
    {  
        int left=0;
        int right=str.length()-1;       
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)) 
            {
                return false; 
            }
            left++;
            right--;
        }
        return true; 
    }
}
