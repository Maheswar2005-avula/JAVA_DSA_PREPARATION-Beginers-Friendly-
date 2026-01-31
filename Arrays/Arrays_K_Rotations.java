package Arrays;
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