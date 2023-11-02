//For a given array of random numbers given from standard input,
// perform a shift of all zeros at the beginning of the sequence.
// Print the transformed array to standard output.

import java.util.Scanner;

public class PushZero
{
    static void pushZerosToBeginning(int arr[], int n)
    {

        int count = n - 1; // Initialize a count variable to keep track of zeros

        // Iterate through the array in reverse order
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                // If the current element is non-zero, move it to the end of the array
                arr[count] = arr[i];
                count--;
            }
        }

        // Fill the beginning elements with zeros
        while (count >= 0) {
            arr[count] = 0;
            count--;
        }



        System.out.println("Transformiranata niza e:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main (String[] args)
    {
        int b;
        Scanner scanner = new Scanner(System.in);
        b= scanner.nextInt();

        int arr[]=new int [b];

        for(int i = 0 ; i<b;i++)
        {
            arr[i]=scanner.nextInt();
        }

        pushZerosToBeginning(arr,b);

    }
}