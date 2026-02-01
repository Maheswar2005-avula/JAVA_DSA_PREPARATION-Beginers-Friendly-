// # LeetCode 303 — Range Sum Query - Immutable

// ## Problem Statement

// Given an integer array `nums`, handle multiple queries of the following type:

// Calculate the **sum of the elements of `nums` between indices `left` and `right` inclusive**, where `left ≤ right`.

// Implement the `NumArray` class:

// - `NumArray(int[] nums)`  
//   Initializes the object with the integer array `nums`.

// - `int sumRange(int left, int right)`  
//   Returns the sum of the elements of `nums` between indices `left` and `right` inclusive  
//   (i.e., `nums[left] + nums[left + 1] + ... + nums[right]`).

// ---

// ## Example

// ### Input
// ["NumArray", "sumRange", "sumRange", "sumRange"]
// [[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]


// ### Output
// [null, 1, -1, -3]


// ### Explanation
// NumArray numArray = new NumArray([-2, 0, 3, -5, 2, -1]);

// numArray.sumRange(0, 2); // (-2) + 0 + 3 = 1
// numArray.sumRange(2, 5); // 3 + (-5) + 2 + (-1) = -1
// numArray.sumRange(0, 5); // (-2) + 0 + 3 + (-5) + 2 + (-1) = -3


// ---

// ## Constraints

// - `1 ≤ nums.length ≤ 10⁴`
// - `-10⁵ ≤ nums[i] ≤ 10⁵`
// - `0 ≤ left ≤ right < nums.length`
// - At most `10⁴` calls will be made to `sumRange`

// ---

// ## Notes

// - The array is **immutable** (does not change after initialization)
// - Multiple range sum queries must be handled efficiently
// - Prefix sum technique is commonly used to solve this problem
import java.util.Arrays;

public class PrefixRangeSum {

    public static void main(String[] args) {

        int[] A = {1, 2, 3, 4, 5, 6, 7};
        int[] P = new int[A.length];

        PrefixRangeSum obj = new PrefixRangeSum();

        // build prefix array
        obj.prefixcal(A, P);

        // get range sum
        int ans = obj.sumrange(P, 2, 5);

        System.out.println("Sum from index 2 to 5 = " + ans);
    }

    // calculate prefix
    public void prefixcal(int[] A, int[] P) {

        P[0] = A[0];

        for (int i = 1; i < A.length; i++) {
            P[i] = P[i - 1] + A[i];
        }

        System.out.println("Prefix Array: " + Arrays.toString(P));
    }

    // RETURN int
    public int sumrange(int[] P, int left, int right) {

        if (left == 0) {
            return P[right];
        }

        return P[right] - P[left - 1];
    }
}
