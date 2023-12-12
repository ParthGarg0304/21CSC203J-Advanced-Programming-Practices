/*Java program to find the digits which are absent in a given mobile number.*/


import java.util.Scanner;

public class MissingDigits{
    //A function that takes a mobile number as a string and returns a string of the missing digits
    public static String findMissingDigits(String mobile){
        //A boolean array to mark the presence of digits 0-9
        boolean[] present = new boolean[10];

        //Loop through each character of the mobile number and mark the corresponding digit as present
        for (int i=0;i<mobile.length();i++){
            //Get the numeric value of the character
            int digit=Character.getNumericValue(mobile.charAt(i));
            //Mark the digit as present
            present[digit]=true;
        }

        //A string builder to store the missing digits
        StringBuilder missing=new StringBuilder();

        //Loop through the boolean array and append the missing digits to the string builder
        for(int i=0;i<10;i++){
            if(!present[i]){
                missing.append(i+" ");
            }
        }
        //Return the string of missing digits
        return missing.toString();
    }
    public static void main(String[] args){
        //Create a scanner object to read user input
        Scanner sc=new Scanner(System.in);
        //Prompt the user to enter a mobile number
        System.out.print("Enter a mobile number:");
        //Read the mobile number as a string
        String mobile=sc.next();
        //Call the function to find the missing digits and print the result
        System.out.println("The missing digits are:"+findMissingDigits(mobile));
        sc.close();
    }
}
