// Problem Statement:
// Given an integer array, print all the unique elements such that each element appears only once, while preserving the original order of the array.

// Example:
// Input:  1 2 2 3 4 1  
// Output: 1 2 3 4
import java.util.Scanner;
import java.util.Arrays;
public class Unique_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array elements: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<arr.length;i++){
            boolean isDuplicate = false;
            for(int j = 0;j<i;j++){
                if(arr[i] == arr[j]){
                    isDuplicate = true;
                    break;
                }
                
            }
            if(!isDuplicate){
                System.out.print(arr[i] + " ");
            }
            
        }
        
        
    }
    
}
