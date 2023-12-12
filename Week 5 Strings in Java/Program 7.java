/*Java program using function that will return true if the two given integer values are equal or their sum or difference is 5.*/


import java.util.Scanner;

public class CheckIntegerConditions{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the first integer:"); //value of first integer is inputed
        int num1=scanner.nextInt();
        System.out.print("Enter the second integer:"); //value of second integer is inputed
        int num2=scanner.nextInt();  
        boolean result=checkConditions(num1,num2);
        System.out.println("Result:"+result);
        scanner.close();
    }
    //function to check whether integers are equal,or their sum or difference is 5
    public static boolean checkConditions(int a,int b){
        return a==b||Math.abs(a-b)==5||(a + b)==5;
    }
}
