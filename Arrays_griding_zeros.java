// Problem Statement:
// Given an integer array, move all the zero elements to the end of the array while maintaining the relative order of the non-zero elements.

// Logic:
// Traverse the array and place all non-zero elements at the beginning using an index pointer, then fill the remaining positions with zeros.

import java.util.*;
public class Arrays_griding_zeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array elemenets: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int index = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]!= 0){
                arr[index] = arr[i];
                index++;
            }
        }
        for(int i = index;i<arr.length;i++){
            arr[i] = 0;
        }
        System.out.print(Arrays.toString(arr));
    }


    
}
