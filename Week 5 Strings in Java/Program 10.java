/*Java program using function to count unique values in an array of 15 elements*/


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//function to count unique values
public class UniqueValueCount{
    static int countUniqueValues(int[]array){
        Set<Integer> uniqueValues=new HashSet<>();
        for(int num:array){
            uniqueValues.add(num);
        }
        return uniqueValues.size();
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[] array=new int[15];

        System.out.print("Enter 15 elements:");
        for(int i= 0;i<15;i++) //loop to input 15 elements
        {
            array[i]=sc.nextInt();
        }
        int uniqueCount=countUniqueValues(array);
        System.out.println("Number of unique values:"+uniqueCount);
        sc.close();
    }
}
