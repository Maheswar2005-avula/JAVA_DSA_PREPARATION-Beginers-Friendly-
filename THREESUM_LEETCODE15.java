// # LeetCode 15 — 3Sum

// ## Problem Statement

// Given an integer array `nums`, return **all the unique triplets**  
// `[nums[i], nums[j], nums[k]]` such that:

// - `i ≠ j`
// - `i ≠ k`
// - `j ≠ k`
// - `nums[i] + nums[j] + nums[k] = 0`

// Notice that the solution set must **not contain duplicate triplets**.

// You can return the answer in **any order**.

// ---

// ## Example 1

// **Input:**
// nums = [-1, 0, 1, 2, -1, -4]


// **Output:**
// [[-1, -1, 2], [-1, 0, 1]]


// ---

// ## Example 2

// **Input:**
// nums = [0, 1, 1]


// **Output:**
// []


// ---

// ## Example 3

// **Input:**
// nums = [0, 0, 0]


// **Output:**
// [[0, 0, 0]]


// ---

// ## Constraints

// - `3 ≤ nums.length ≤ 3000`
// - `-10⁵ ≤ nums[i] ≤ 10⁵`
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class THREESUM_LEETCODE15 {

    // MAIN METHOD (VS Code execution starts here)
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] nums = new int[size];

        System.out.print("Enter array elements: ");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        THREESUM_LEETCODE15 obj = new THREESUM_LEETCODE15();

        List<List<Integer>> result = obj.threeSum(nums);

        System.out.println("Triplets whose sum is zero:");
        System.out.println(result);

        sc.close();
    }

    // 3SUM LOGIC
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            // skip duplicate i
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {

                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // skip duplicates
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;

                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }
}
