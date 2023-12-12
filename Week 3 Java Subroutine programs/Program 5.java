/*program that uses dynamic memory allocation to simulate a banking system that stores customer information, account details, and transactions.*/

import java.util.Scanner;

// Class  1
// Bank class
// Defining the banking transaction
class Bank {
 
    // Initial balance $100
    int total = 10000;
 
    // Money withdrawal method. Withdraw only if
    // total money greater than or equal to the money
    // requested for withdrawal
 
    // Method
    // To withdraw money
    void withdrawn(String name, int withdrawal)
    {
        if (total >= withdrawal) {
            System.out.println(name + " withdrawn "
                               + withdrawal);
 
            total = total - withdrawal;
            System.out.println("Balance after withdrawal: "
                               + total);
            // Making the thread sleep for 1 second after
            // each withdrawal
 
            // Try block to check for exceptions
            try {
 
                // Making thread t osleep for 1 second
                Thread.sleep(1000);
            }
 
            // Catch block to handle the exceptions
            catch (InterruptedException e) {
 
                // Display the exception along with line
                // number
                // using printStacktrace() method
                e.printStackTrace();
            }
        }
 
        // If the money requested for withdrawal is greater
        // than the balance then deny transaction*/
        else {
 
            System.out.println(name
                               + " you can not withdraw "
                               + withdrawal);
 
            System.out.println("your balance is: " + total);
 
            // Making the thread sleep for 1 second after
            // each transaction failure
 
            // Try block to check for exceptions
            try {
                Thread.sleep(1000);
            }
 
            catch (InterruptedException e) {
 
                e.printStackTrace();
            }
        }
    }
 
    // Method - to deposit money
    // Accept money whenever deposited
    void deposit(String name, int deposit)
    {
        System.out.println(name + " deposited " + deposit);
        total = total + deposit;
        System.out.println("Balance after deposit: "
                           + total);
        // Making the thread sleep for 1 second after
        // each deposit
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
// Class 2
// main class
class main {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        //int amt,op;
        //String name;
        boolean x=true;
        //char ch;

 
        // Creating object of class 1 inside main()
        Bank obj = new Bank();
        
        while(x==true){
            System.out.println("enter the user name");
            String name = s.nextLine();
            System.out.println("enter amount");
            int amt = s.nextInt();
            
            System.out.println("enter operation");
            System.out.println("1: withdraw");
            System.out.println("2:deposit");
            int op = s.nextInt();
            
            if(op==1){
                obj.withdrawn(name, amt);
                
            }
            else if(op==2){
                obj.deposit(name, amt);
            }
            else{
                System.out.println("wrong input");
            }
            System.out.println("do you want to continute??(y/n)");
            String ch=s.nextLine();
            if (ch=="y"){
                x=true;
            }
            else{
                x=false;
            }

        }
        
    }
}
