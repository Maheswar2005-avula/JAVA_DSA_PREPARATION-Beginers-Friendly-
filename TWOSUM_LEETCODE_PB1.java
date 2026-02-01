// # Two Sum — LeetCode Problem #1

// ## Problem Statement

// Given an array of integers `nums` and an integer `target`, return the indices of the two numbers such that they add up to the target.

// You may assume that each input has exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

// ---

// ## Example

// **Input:**
// nums = [2, 7, 11, 15]
// target = 9


// **Output:**
// [0, 1]


// **Explanation:**  
// Because `nums[0] + nums[1] = 2 + 7 = 9`, the indices `[0, 1]` are returned.




import java.util.Scanner;

public class TWOSUM_LEETCODE_PB1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();

        boolean targetFound = false;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {

                    System.out.println("Indices : [" + i + ", " + j + "]");
                    //System.out.println("Values  : [" + arr[i] + ", " + arr[j] + "]");

                    targetFound = true;
                    break;
                }
            }

            if (targetFound) {
                break;
            }
        }

        if (!targetFound) {
            System.out.println("No pair found");
        }

        sc.close();
    }
}
