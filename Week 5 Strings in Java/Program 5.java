/*Java function (using function) that checks whether a given number is prime or not
(Note : function type - with arguments with return values)*/

  
import java.util.Scanner;

public class CheckPrime{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:"); //input number from user
        int number=sc.nextInt();
        boolean isPrime=checkPrime(number);
        if(isPrime==true) //prints if condition is true
        {
            System.out.println("Number is prime.");
        }
        else //prints if condition is not true
        {
            System.out.println("Number is not prime.");
        }
        sc.close();
    }
    //function to check if number is prime or not
    public static boolean checkPrime(int num)
    {
        if(num<=1){
            return false; 
        }        
        for (int i=2;i*i<=num;i++){
            if(num%i==0){
                return false; 
            }
        }       
        return true; 
    }
}
