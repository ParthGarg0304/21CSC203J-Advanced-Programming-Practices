/*Implement a subroutine program to check if a given string is a palindrome or not.*/


import java.util.Scanner;
 
class palindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string \n");
        String input= scanner.nextLine();
        
        if(isPalindrome(input))   
        {
            System.out.println(input+" is a palindrome string");
        }
        else
        {
            System.out.println(input+" is not a palindrome string");
        }
    }
    
    //subroutine for checking
    public static boolean isPalindrome(String str) {     
        int left = 0, right = str.length() - 1;
        
        while(left < right)
        {
            if(str.charAt(left) != str.charAt(right))  //not palindrome
            {
                return false;
            }
            left++;
            right--;
        }
        return true;    //palindrome
    } 
}
