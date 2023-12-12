/*program that dynamically allocates memory for an array of integers based on user input and then finds the sum of all elements in the array.*/

import java.util.Scanner;

public class sum {
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
		int[] ptr; //declaration of integer pointer
		int n; //to store array limit
		int sum; //to store sum of all elements

		System.out.print("Enter number of elements: ");
		n = s.nextInt();

		//declare memory dynamically
		ptr = new int[n];

		//read array elements
		for(int i = 0; i < n; i++) {
			System.out.printf("Enter element %02d: ", i + 1);
			ptr[i] = s.nextInt();
		}

		//print array elements
		System.out.println("\nEntered array elements are:");
		for(int i = 0; i < n; i++) {
			System.out.println(ptr[i]);
		}
		
		//calculate sum of all elements
		sum = 0;
		for(int i = 0; i < n; i++) {		
			sum += ptr[i];
		}
		System.out.println("Sum of array elements is: " + sum);
	}

}
