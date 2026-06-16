import java.util.*;

public class PairWithSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        HashSet<Integer> set = new HashSet<>();
        boolean found = false;
        for(int num : arr){
            if(set.contains(target - num)){
                System.out.println("Pair found: (" + num + ", " + (target-num) + ")");
                found = true;
                break;
            }
            set.add(num);
        }
        if(!found) System.out.println("No pair found.");
    }
}

