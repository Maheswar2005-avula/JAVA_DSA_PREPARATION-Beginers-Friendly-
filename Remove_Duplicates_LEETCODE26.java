// Problem Statement (LeetCode 26 – Remove Duplicates from Sorted Array):

// Given a sorted integer array nums, remove the duplicates in-place such that each unique element appears only once.

// The relative order of the elements should be kept the same.

// Return the number of unique elements.

// Example:
// Input: nums = [1,1,2]
// Output: 2
// Explanation: The first two elements of nums are 1 and 2.
import java.util.Scanner;

public class Remove_Duplicates_LEETCODE26 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        if (size == 0) {
            System.out.println("Array is empty");
            return;
        }

        int[] arr = new int[size];

        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Two-pointer logic
        int index = 1;

        for (int i = 1; i < size; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[index] = arr[i];
                index++;
            }
        }

        System.out.println("Number of unique elements: " + index);

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
