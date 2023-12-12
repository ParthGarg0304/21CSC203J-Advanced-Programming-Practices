/*a subroutine program to reverse an array of integers in-place.*/

import java.util.Scanner;

public class reverse{
  
    // function that reverses array
    static void reverse(int a[], int n)
    {
        int[] b = new int[n];
        int x = n;
        for (int i = 0; i < n; i++) {
            b[x - 1] = a[i];
            x = x - 1;
        }
  
        // printing the reversed array
        System.out.println("Reversed array is: \n");
        for (int k = 0; k < n; k++) {
            System.out.println(b[k]);
        }
    }
  
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int arr[];
        int n;    // length of array
        System.out.print("Enter number of elements: ");
		n = s.nextInt();
		
		arr = new int[n];

        for(int i = 0; i < n; i++) {
			System.out.printf("Enter element %02d: ", i + 1);
			arr[i] = s.nextInt();
        }

        reverse(arr,n);
    }
}
