/*JAVA program to sum of two given integers. However, if the
sum is between 105 to 200 it will return 200.*/

  
import java.util.Scanner;

class month{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int sum;    //counter variable
        System.out.println("Enter 1st number");
        int a=s.nextInt();
        System.out.println("Enter 2nd number");
        int b=s.nextInt();
        
        sum=a+b;
        
        if(sum>105 & sum<200){
            sum=200;
        }
        
        System.out.println(sum+" is the sum");        

    }
}
