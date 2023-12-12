/*Java program (using function) to print the even numbers from a given list*/

  
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvenNumbers{
    public static void main(String[] args){
        System.out.println("Parth Garg \nRA2211003011322");
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number of elements in the list:"); //input no. of elements in list
        int n=scanner.nextInt();

        List<Integer> numbers=new ArrayList<>(); //a list is declared
        for(int i=0;i<n;i++) //loop to get values of list elements
        {
            System.out.print("Enter element "+(i+1)+":");
            int num=scanner.nextInt();
            numbers.add(num);
        }
        System.out.println("Original list of numbers:" + numbers); //original list is displayed
        System.out.println("Even numbers in the list:"); //only even no. from the list are displayed
        printEvenNumbers(numbers);
        scanner.close();
    }
    //function to find even numbers in a list
    public static void printEvenNumbers(List<Integer> numbers){
        for(int num:numbers){
            if(num%2==0){
                System.out.println(num);
            }
        }
    }
} 
