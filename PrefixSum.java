import java.util.*;
public class PrefixSum {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6};
        int[] P = new int[A.length];
        P[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            P[i] = P[i - 1] + A[i];
        }
        System.out.println("A → " + Arrays.toString(A));
        System.out.println("P → " + Arrays.toString(P));
    }
}
