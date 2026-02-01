import java.util.Arrays;

public class PrefixRangeSum {
    
    public static void main(String[] args) {
        int[] A= {1,2,3,4,5,6,7};
        int[] P = new int[A.length];
        P[0] = A[0];
        for(int i = 1;i<A.length;i++){
            P[i] = P[i-1] +A[i];
        }
        System.out.println(Arrays.toString(P));
        int left = 2;int right = 5;
        int rangeSum = P[right] - P[left - 1];
        System.out.println(rangeSum);
    }
}
