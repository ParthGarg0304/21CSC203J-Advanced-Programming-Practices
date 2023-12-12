/*JAVA program to check the validity of password input by users.*/


import java.util.Scanner;

class month{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String pass;    //counter variable
        System.out.println("Enter the password");
        pass=s.nextLine();
        
        int length=pass.length();
        
        if(length>=6 & length<=16 ){
            System.out.println("valid password");
        }
        else{
            System.out.println("Invalid password");
        }
        
    }
}
