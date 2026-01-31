

// This program demonstrates how to rotate an integer array to the right by **K positions** using Java.

// The logic works by first reducing unnecessary rotations using the modulo operator and then placing each element into its correct rotated position using index mapping.

// Right rotation means the elements at the end of the array move to the beginning after rotation.

// Example:  
// Input Array: 1 2 3 4 5  
// K = 2  
// Output Array: 4 5 1 2 3  

// The core logic used in this program is:
// (i + k) % n  
// This ensures every element moves to the correct index without exceeding the array bounds.

// Time Complexity: O(n)  
// Space Complexity: O(n)

// Concepts used in this program include arrays, modulo operation, index-based traversal, and basic input handling in Java.

// This code is part of my daily Data Structures and Algorithms practice, focused on strengthening array manipulation concepts and interview preparation.
import java.util.*;
public class Arrays_K_Rotations{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number of shifts to be done: ");
        int shift = sc.nextInt();
        shift = shift%n;
        int result[] = new int[n];
        for(int i = 0;i<arr.length;i++){
            result[(i+shift)%n] =arr[i];
        }
        System.out.print(Arrays.toString(result));
    }      
}