// # Three Sum (Array – Brute Force)

// ## Problem Statement

// Given an array of integers and a target value, find **three distinct elements** in the array such that their sum is equal to the given target.

// The program should print the **indices and values** of the first valid triplet found.

// If no such triplet exists, print an appropriate message.

// ---

// ## Input Format

// - An integer `n` representing the size of the array  
// - `n` integers representing the array elements  
// - An integer `target` representing the required sum  

// ---

// ## Output Format

// - Print the indices and values of the triplet whose sum equals the target  
// - If no such triplet exists, print:

// No triplet found


// ---

// ## Example

// ### Input
// Enter the size of the array: 7
// Enter array elements: 1 2 3 4 5 6 7
// Enter the target element: 10


// ### Output
// Indices: 0 1 6
import java.util.Scanner;

public class Threesome_arrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target element: ");
        int target = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < arr.length && !found; i++) {

            for (int j = i + 1; j < arr.length && !found; j++) {

                for (int k = j + 1; k < arr.length; k++) {

                    if (arr[i] + arr[j] + arr[k] == target) {

                        System.out.println("Indices: " + i + " " + j + " " + k);
                        //System.out.println("Values : " + arr[i] + " " + arr[j] + " " + arr[k]);

                        found = true;
                        break;
                    }
                }
            }
        }

        if (!found) {
            System.out.println("No triplet found");
        }

        sc.close();
    }
}
