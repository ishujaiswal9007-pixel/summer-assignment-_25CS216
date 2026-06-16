import java.util.*;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array (n-1): ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        int sum = 0;
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        int total = (n+1)*(n+2)/2; // sum of 1..n+1
        int missing = total - sum;
        System.out.println("Missing number: " + missing);
    }
}
